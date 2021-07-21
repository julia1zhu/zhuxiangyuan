import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 朱香原
 */
@SuppressWarnings("all")
public class Order {
    private int id; //订单编号
    private int queueId; //排队序号
    private String startTime; //订单生成时间
    private String status; // 订单状态
    private String endTime; //订单完成时间
    private double price;
    private double subTotal; // 菜品小计价格
    private double orderDisccount = 1.0;  //折扣信息
    private Object memberId = 0; //会员编号
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

    List<FoodInfo> foodInfoList = new LinkedList<>();
    FoodInfo fi; //内部类

    //赠品详情加入
    public Order(int queueId,FoodInfo foodInfo){
        this.queueId = queueId;
        fi = foodInfo;
        startTime = df.format(new Date());;// new Date()为获取当前系统时间，也可使用当前时间戳
        this.status = "未完成";
        this.price = 0;
        this.subTotal = 0;

    }

    //顾客如果是会员点单之后采用这个构造器
    public Order(int id, int queueId,Object memberId,FoodInfo foodInfo) {
        this.id = id;
        this.queueId = queueId;
        this.memberId = memberId;
        fi = foodInfo;
        this.orderDisccount = Service.getCharge(memberId);
        startTime = df.format(new Date());;// new Date()为获取当前系统时间，也可使用当前时间戳
        this.status = "未完成";
        this.price = FoodSQL.foodPrice.get(foodInfo.codeName);
        this.subTotal = this.price*foodInfo.copies;


    }

    // 顾客如果不是会员点单采用这个构造器
    public Order(int id, int queueId,FoodInfo foodInfo) {
        this.id = id;
        this.queueId = queueId;
        fi = foodInfo ;
        startTime = df.format(new Date());;// new Date()为获取当前系统时间，也可使用当前时间戳
        this.status = "未完成";
        this.price = FoodSQL.foodPrice.get(foodInfo.codeName);
        this.subTotal = this.price*foodInfo.copies;

    }

    @Override
    public String toString() {
        return  fi.foodName + "\t\t" +
                fi.scale + "\t\t" +
                fi.copies + "\t\t" +
                price + "\t\t" +
                subTotal + "\t\t" +
                status + "\t\t\t\t" +
                startTime + "\t\t" +
                endTime;

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQueueId() {
        return queueId;
    }

    public void setQueueId(int queueId) {
        this.queueId = queueId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String isStatus() {
        return status;
    }

    public String getEndTime() {
        return endTime;
    }


    public double getOrderDisccount() {
        return orderDisccount;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public Object getMemberId() {
        return memberId;
    }

    public void setMemberId(Object memberId) {
        this.memberId = memberId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setOrderDisccount(double orderDisccount) {
        this.orderDisccount = orderDisccount;
    }


    //内部类，用来记录菜品详情
    static class FoodInfo {
        private int codeName;
        private String foodName;
        private String scale;
        private int copies;


        public FoodInfo(int codeName,String foodName, String scale, int copies) {
            this.codeName = codeName;
            this.foodName = foodName;
            this.scale = scale;
            this.copies = copies;


        }

        public String getFoodName() {
            return foodName;
        }

        public void setFoodName(String foodName) {
            foodName = foodName;
        }

        public String getScale() {
            return scale;
        }

        public void setScale(String scale) {
            this.scale = scale;
        }

        public int getCopies() {
            return copies;
        }

        public void setCopies(int copies) {
            this.copies = copies;
        }

    }

    public void addFoodInfo(int index, int needNumber) {
        FoodInfo fi = new FoodInfo(index, needNumber);
        foodInfoList.add(fi);
    }

}

