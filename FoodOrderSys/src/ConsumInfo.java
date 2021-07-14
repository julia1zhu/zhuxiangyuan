/**
 * @author 朱香原
 */
@SuppressWarnings("all")
public class ConsumInfo {
    int i = 0;
    private String foodName;
    private int consum ;
    private double tolIncome;


    public ConsumInfo(String foodName, int consum, double tolIncome) {
        this.foodName = foodName;
        this.consum = consum;
        this.tolIncome = tolIncome;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getConsum() {
        return consum;
    }

    public void setConsum(int consum) {
        this.consum = consum;
    }

    public double getTolIncome() {
        return tolIncome;
    }

    public void setTolIncome(double tolIncome) {
        this.tolIncome = tolIncome;
    }

    @Override
    public String toString() {
        return
                foodName + "\t\t" + consum + "\t\t" + tolIncome ;
    }


}
