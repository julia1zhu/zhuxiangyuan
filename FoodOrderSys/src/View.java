import java.util.LinkedList;
import java.util.List;

/**
 * @author 朱香原
 */
@SuppressWarnings("all")
public class View {

    //创建一个Service对象
    static Service service = new Service();


    //创建一个FoodSQL对象
        FoodSQL FoodSQL = new FoodSQL();

        //显示点餐菜单
        public void showMenu() {
            System.out.println("================菜单==================");
            System.out.println("       =========主食========          ");
            for (int i = 0; i < FoodSQL.foodSize(); i++) {
                System.out.println((i + 1) + "." + FoodSQL.foodName.get(i) + "\t\t" + FoodSQL.foodScale.get(i) + "\t\t  "
                        + FoodSQL.foodPrice.get(i) + ""
                        + FoodSQL.foodSpecification.get(i) + "\t\t余量"
                        + FoodSQL.foodNumber.get(i));

            }
            System.out.println("       =========鱼类========          ");
            for (int i = FoodSQL.foodSize(); i < FoodSQL.fishSize(); i++) {
                System.out.println((i + 1) + "." + FoodSQL.foodName.get(i) + "\t  "
                        + FoodSQL.foodPrice.get(i) + ""
                        + FoodSQL.foodSpecification.get(i) + "\t余量"
                        + FoodSQL.foodNumber.get(i));

            }
        }

    // 注册会员
    int memberId = 0;
    double discount;
    public void memberRegister() {
        System.out.println("你是否是会员");
        char memberIf = Utility.readConfirmSelection();
        if(memberIf == 'N'){
            System.out.println("你是否要充值会员，将会有优惠活动");
            char beMember = Utility.readConfirmSelection();
            if(beMember == 'Y'){
                System.out.println("请选择充值会员额度");
                System.out.println("充值金额1000以上为金卡，将享受7折优惠\n充值金额500-1000为银卡，将享受8折优惠\n" +
                        "充值金额500以下为普通会员，享受9折优惠");
                int charge = Utility.readInt();
                //为其分配一个会员id
                memberId = (int)Service.memberRegister(memberId,charge);
                System.out.println("您的会员id是：" + memberId);
            }
        }else{  //顾客已经是会员
            System.out.println("请输入你的会员id");
            memberId = Utility.readInt();
        }
    }

    // 用户进行点餐
    static List<Double> foodSubIncome = new LinkedList();
    public void order () {

        for(int i = 0;i < FoodSQL.foodName.size();i++){
            foodSubIncome.add(0.0);
        }
        int i = 0;
        do {  // 进行点餐

            System.out.println("请输入菜品代号");
            int codeName = Utility.readInt();

            //菜品超过供应上线，食客不能再点
            if(FoodSQL.foodNumber.get(codeName-1) <= 0){
                System.out.println("此菜品已经售完。。，请重新选择");
            }

            System.out.println("请输入份数");
            int copies = Utility.readInt();

            if(FoodSQL.foodNumber.get(codeName-1) < copies){
                System.out.println("此菜品还剩" + FoodSQL.foodNumber.get(codeName-1) + "份，请重新选择");
            }

            //在一个集合中储存该菜品消费量
            FoodSQL.foodConsuming.set(codeName - 1,FoodSQL.foodConsuming.get(codeName-1) + copies);
            //在一个集合中储存该菜品总营收量，其中被不同顾客点单的时候打的折扣不一样，所以营收量也不一样
            foodSubIncome.set(codeName-1,(double)foodSubIncome.get(codeName-1)
                    + copies*(double)FoodSQL.foodPrice.get(codeName-1)*(double)service.memberShip.get(memberId));

            //顾客点单后，对菜品的数量进行相应的设置,这里是剩余供应量
            FoodSQL.foodNumber.set(codeName -1,FoodSQL.foodNumber.get(codeName - 1) - copies);

            String name = FoodSQL.foodName.get(codeName-1);
            String scale = FoodSQL.foodScale.get(codeName-1);

            // 创建内部类对象
            OrderInfo.FoodInfo foodInfo = new OrderInfo.FoodInfo(codeName,name,scale,copies);

            if(memberId != 0){
                // 将内部类对象传入类中
                service.vipAdd(foodInfo,memberId);
            }else{
                service.add(foodInfo);
            }

            System.out.println("=========是否继续点单===========");
            char c = Utility.readConfirmSelection();
            if (c == 'N') {
                Service.id++;
                Service.queueId++;
                break;
            }

        }while (true) ;

    }

    int findQueueId;
    //1>根据排队序号查看详情
     public void searchByQueue() {
        System.out.println("请输入排队序号");
        findQueueId = Utility.readInt();
        service.returnInfoById(findQueueId);
    }

    //2> 统计菜品的剩余供应量，根据菜品名/编号查看菜品的剩余供应量
    public void checkNumber(){
        System.out.println("请输入要查找剩余供应量的菜品编号");
        int id = Utility.readInt();
        System.out.println(FoodSQL.foodName.get(id-1) + "的剩余供应量是：" + service.checkFoodNumber(id));

    }

    //3> 根据当前时刻未完成查看所有的订单
    public void searchByState(){
        service.searchByState();
    }


    //4>统计每个菜品的消费量和实际营收金额（支持按营收和被消费的份数进行排序——支持正序和倒序）
    public void calConsumAndIncome(){
        System.out.println("菜品\t\t消费量\t\t实际营收金额");
        System.out.println("请选择按什么方式排列:1-份数正序，2-份数倒叙，3-营收正序，4-营收倒序");
        int choice = Utility.readInt();
        service.calConsumAndIncome(choice);

    }

    //5>统计每天总营收金额、单量、平均每单的消费额、总折扣金额（“每天”可通过设置系统时间进行模拟）
    public void getTodayInfo(){
        service.getTodayInfo();
    }

    //6>获取近期的爆款菜品（近5天被点份数数最多的菜品）
    public void getFavorite(){
        System.out.println("=================被点份数数最多的菜品=================");
        service.getFavorite();
    }

    //7>统计每天赠送的菜品详情
    public void getGift(){
         System.out.println("菜品\t份数");
         service.getGift();
    }


    //8>统计每天每单的等待时间（支持排序）、平均等待时间


    //管理员设置赠品，在查看订单中进行赠品赠送
    //只要消费金额超过 100，可以赠送单价低于 10元的菜品一份（系统需要给操作员提示），
    // 可以赠送单价低于 10元的菜品一份（系统需要给操作员提示）
    public void setGift() {
        searchByQueue();
        if(Service.totolIncome.get(findQueueId) > 100){
            System.out.println("顾客消费金额超过100，请选择赠送的菜品");
            System.out.println("可以赠送的菜品信息为：");
            System.out.println("菜品代号: \t菜品: \t剩余份数");
            System.out.println("请选择要赠送的菜品代号");
            int id = Utility.readInt();
            String name = FoodSQL.foodName.get(id-1);
            String scale = FoodSQL.foodScale.get(id-1);
            int copies = 1;

            // 将赠品信息加进订单，也就是根据排队序号加进去
            OrderInfo.FoodInfo foodInfo = new OrderInfo.FoodInfo(id,name,scale,copies);
            service.giftAdd(findQueueId,foodInfo);

            // 对分量进行-1
            FoodSQL.foodNumber.set(id -1,FoodSQL.foodNumber.get(id-1) - 1);

            // 赠送菜品信息进行储存
            Service.giftFood.put(FoodSQL.foodName.get(id-1),(int)Service.giftFood.get(FoodSQL.foodName.get(id-1)) + 1);
        }

    }

    //管理员设置每种菜的供应上限
    public void setSuffer () {
        System.out.println("请输入菜品编号");
        int id = Utility.readInt();
        System.out.println("请输入此菜品的一天供应量");
        int num = Utility.readInt();
        service.setFoodSuffer((id-1),num);
    }


    //管理员设置优惠打折的菜品
    public void setDiscount() {
        System.out.println("今天有优惠的菜品为（输入代号）：");
        int discountFoodCodeName = Utility.readInt();
        System.out.println("该菜品今天折扣为");
        //可以考虑在工具类写一个方法
        String dis = Utility.readString(10);
        double discount = Double.valueOf(dis);
    }


    // 管理员对订单消息进行一系列查看操作
    public void searchOrderInfo() {
        System.out.println("1> 根据排队序号查看订单详情");
        System.out.println("2> 统计菜品的剩余供应量、根据菜品名/编号查看菜品的剩余供应量");
        System.out.println("3> 查看到当前时刻还没有完成的所有订单");
        System.out.println("4> 统计每个菜品的消费量和实际营收金额（支持按营收和被消费的份数进行排序——支持正序和倒序");
        System.out.println("5> 统计每天总营收金额、单量、平均每单的消费额、总折扣金额（“每天”可通过设置系统时间进行模拟）");
        System.out.println("6> 获取近期的爆款菜品（近5天被点份数数最多的菜品)");
        System.out.println("7> 统计每天赠送的菜品详情");
        System.out.println("8> 统计每天每单的等待时间（支持排序）、平均等待时间");
        System.out.println("9> 服务员对顾客进行赠品赠送操作");

        // 选择具体一项操作
        System.out.println("请输入你的选择1-8");
        int choice = Utility.readChar();
        switch (choice){
            case '1':

                searchByQueue();
                break;
            case '2':
                checkNumber();
                break;
            case '3':
                searchByState();
                break;
            case '4':
                calConsumAndIncome();
                break;
            case '5':
                getTodayInfo();
                break;
            case '6':
                getFavorite();
                break;
            case '7':
                getGift();
                break;
            case '8':

                break;
            case '9':
                setGift();
                break;
            default:
                break;
        }


    }


    public void mainFunc(){
        do{
            System.out.println("1  点餐");
            System.out.println("2  查看订单信息");
            System.out.println("请输入你的选择1-2");
            int key = Utility.readChar();
            switch(key){
                case '1':
                    memberRegister();
                    showMenu();
                    order();

                    break;
                case '2':
                    searchOrderInfo();
                    break;
            }
        }while(true);
    }
}
