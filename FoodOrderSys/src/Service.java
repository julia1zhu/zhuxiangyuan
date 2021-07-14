import java.util.*;

/**
 * @author 朱香原
 */
@SuppressWarnings("all")
public class Service {
    static int id = 1;  //订单编号，静态变量，可以更改
    static int queueId = 1; //排队序号
    static LinkedList<OrderInfo> linkedList = new LinkedList();
    static Map<Integer,Double> totolIncome = new HashMap(); //用来记录各单营业金额
    static Map<Integer,Double> totolDiscountIncome = new HashMap(); //用来记录各单折扣后金额
    static Map giftFood = new HashMap(); //用来记录赠品详情


    /**
     * 点单服务
     */
    //将赠品的详情加入集合
    public void giftAdd(int giftId, OrderInfo.FoodInfo foodInfo) {
        linkedList.add(new OrderInfo(giftId,foodInfo));
    }
    // 将有会员的顾客点单详情加入集合
    public void vipAdd(OrderInfo.FoodInfo foodInfo, int memberId) {
        linkedList.add(new OrderInfo(id, queueId, memberId, foodInfo));
    }

    // 将没有会员的顾客订单详情加入集合
    public void add(OrderInfo.FoodInfo foodInfo) {
        linkedList.add(new OrderInfo(id, queueId, foodInfo));
    }

    //根据排队序号查找订单
    int firstIndex;
    int lastIndex;
    double orderMoney;
    double realMoney;
    public void returnInfoById(int queueId) {
        for (OrderInfo orderInfo : linkedList) {
            if(orderInfo.getQueueId() == queueId){
                firstIndex = linkedList.indexOf(orderInfo);
                lastIndex = linkedList.lastIndexOf(orderInfo);
                break;
            }
        }

        OrderInfo orderInfo = linkedList.get(firstIndex);
        System.out.println("===========================订单信息===========================");
        System.out.println("订单号：" + orderInfo.getId());
        System.out.println("排队序号：" + orderInfo.getQueueId());
        System.out.println("菜名\t\t规格\t\t数量\t\t单价\t\t小计\t\t状态\t\t\t\t下单时间\t\t\t\t订单完成时间");

        for(int i = firstIndex;i <= lastIndex;i++) {
            if (orderInfo.getQueueId() == queueId){
                OrderInfo o = linkedList.get(i);
                System.out.println(o);
                orderMoney += o.getSubTotal();
            }
        }

        for (OrderInfo info : linkedList) {
            if (orderInfo.getQueueId() == queueId){
                System.out.println(info);
                orderMoney += info.getSubTotal();
            }
        }


        realMoney = (double)Math.round(orderMoney*orderInfo.getOrderDisccount()*100)/100;

        System.out.println("订单总金额：" +orderMoney);
        System.out.println("折扣信息：" + orderInfo.getOrderDisccount());
        System.out.println("实付款：" + realMoney);

        totolIncome.put(queueId,orderMoney);
        totolDiscountIncome.put(queueId,realMoney);
    }

    //2. 根据菜品名/编号查看菜品的剩余供应量
    public int checkFoodNumber(int id){
        return FoodSQL.foodNumber.get(id-1);
    }

    //3. 根据状态查看订单
    ArrayList readyId;//辅助变量
    int readyCount = 0;
    public void searchByState(){
        for (OrderInfo orderInfo : linkedList) {
            if(orderInfo.getStatus() == "未完成"){
                readyId.add(orderInfo.getQueueId());
                readyCount++;
            }
        }
        if(readyCount != 0) {
            System.out.println("未完成订单数为" + readyCount + "份");
            for (Object o : readyId) {
                System.out.println(o);
            }
        }else{
            System.out.println("所有订单都已完成");
        }
    }

    //4>统计每个菜品的消费量和实际营收金额（支持按营收和被消费的份数进行排序——支持正序和倒序）
    ArrayList arrayList = new ArrayList();
    public void calConsumAndIncome(int choice) {
        for(int i = 0;i < FoodSQL.foodName.size();i++){
            arrayList.add(new ConsumInfo(FoodSQL.foodName.get(i),FoodSQL.foodConsuming.get(i),View.foodSubIncome.get(i)));
        }
        switch (choice){
            case '1':
                //按照消费份数正序排列
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        ConsumInfo consum1 = (ConsumInfo)o1;
                        ConsumInfo consum2 = (ConsumInfo)o2;
                        return consum1.getConsum() - consum2.getConsum();
                    }
                });
                break;
            case '2':
                //按照消费份数倒序排列
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        ConsumInfo consum1 = (ConsumInfo)o1;
                        ConsumInfo consum2 = (ConsumInfo)o2;
                        return consum2.getConsum() - consum1.getConsum();
                    }
                });
                break;
            case '3':
                //按营收金额正序排列
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        ConsumInfo consum1 = (ConsumInfo)o1;
                        ConsumInfo consum2 = (ConsumInfo)o2;
                        return (int)(consum1.getTolIncome() - consum2.getTolIncome());
                    }
                });
                break;
            case '4':
                //按营收金额倒序排列
                Collections.sort(arrayList, new Comparator() {
                    @Override
                    public int compare(Object o1, Object o2) {
                        ConsumInfo consum1 = (ConsumInfo)o1;
                        ConsumInfo consum2 = (ConsumInfo)o2;
                        return (int)(consum2.getTolIncome() - consum1.getTolIncome());
                    }
                });
                break;
            default:
                break;
        }

        for (Object o : arrayList) {
            System.out.println(o);
        }

    }

    //5>统计每天总营收金额、单量、平均每单的消费额、总折扣金额（“每天”可通过设置系统时间进行模拟）
    double income;
    int orderNum;
    double discountIncome;
    double avgIncome;
    public void getTodayInfo(){
        //营业单数
        orderNum = totolIncome.size();
        //营收总金额
        Collection values = totolIncome.values();
        for (Object value : values) {
            income += (Double)value;
        }
        //平均每单的消费额
        avgIncome = income/orderNum;
        //总折扣金额
        Collection<Double> values1 = totolDiscountIncome.values();
        for (Double aDouble : values1) {
            discountIncome += aDouble;
        }

        System.out.println("每天总营收金额：" + income +  "\n营业单数：" + orderNum + "\n平均每单消费额：" + avgIncome
                + "\n总折扣金额：" + discountIncome);
    }


    //6>获取近期的爆款菜品（近5天被点份数数最多的菜品）
    int max = 0;
    int a = 0;
    int[] foodConsuming;
    int[] favoriteFoodIndex;
    public void getFavorite() {
        //为了获取被点份数多的菜品，需要通过份数得到名字，因此需要得到索引，所以将其转为数组
        for(int i = 0;i < FoodSQL.foodConsuming.size();i++){
            foodConsuming[i] = FoodSQL.foodConsuming.get(i);
        }

        //有可能被点份数最多的菜品有几样，因此索引都应该记下，将其记录于数组
        for(int i = 0;i < foodConsuming.length;i++){
            if(foodConsuming[i] >= max){
                max = foodConsuming[i];
                favoriteFoodIndex[a++] = i;
            }
        }

        for(int i = 0;i < favoriteFoodIndex.length;i++){
           System.out.println("菜品：" + FoodSQL.foodName.get(favoriteFoodIndex[i]) + " 被点了" + foodConsuming[i] + "份" );
        }
    }

    //获取现在低于10块的菜哪些还有剩余
    public void setGift(){
        for(int i = 0;i <FoodSQL.foodPrice.size();i++){
            if(FoodSQL.foodPrice.get(i) < 10){
                System.out.println((i+1) + "\t" + FoodSQL.foodName.get(i) + "\t" + FoodSQL.foodNumber.get(i) );
            }
        }
    }

    //点单之前将优惠菜品设置为0
    public static void zeroGiftFood(){
        for(int i = 0;i <FoodSQL.foodName.size();i++){
            giftFood.put(FoodSQL.foodName.get(i),0);
        }

    }

    //7>统计每天赠送的菜品详情
    public void getGift(){
        Set set = giftFood.entrySet();
        for (Object entry : set) {
            //将entry对象 转成 Map.Entry
            Map.Entry m = (Map.Entry)entry;
            if((int)m.getValue() != 0){
                System.out.println(m.getKey() + "\t" + m.getValue());
            }
        }
    }


    /**
     * 会员服务
     */
    static int defaultId = 1;
    static int memberId = 0;
    static double discount;
    static HashMap memberShip;

    //根据顾客充值的金额来决定是什么等级的会员
    //并且将会员的id号返回给顾客
    //顾客的会员号和对应的折扣信息存储在集合里
    public static Object memberRegister(Object memberId,int charge){
        memberShip = new HashMap();
        memberId = defaultId++;
        if(charge >= 1000){
            discount = 0.7;
        }else if(charge >= 500 && charge <1000){
            discount = 0.8;
        }else if(charge >0 && charge <500){
            discount = 0.9;
        }
        memberShip.put(memberId,discount);
        return  memberId;
    }

    // 根据会员的id号来获取折扣信息
    public static double getCharge(Object memberId){
        return (double)(memberShip.get(memberId));
    }



    //管理员设置每种菜的供应上限
    public void setFoodSuffer (int codeName,int num) {
        FoodSQL.foodNumber.set(id,num);
    }


    //管理员设置优惠打折的菜品
    public void setFoodDiscount(int codeName,double discount) {
        FoodSQL.foodPrice.set(codeName-1, (FoodSQL.foodPrice.get(codeName-1))*discount);
    }

}


