import ilog.concert.IloException;


/**
 * @author 朱香原
 */
public class Main {
    public static void main(String[] args) throws IloException {

        long begin = System.currentTimeMillis();

        IPInstance ipInstance = new IPInstance();
        BNBSearch bnbSearch = new BNBSearch(ipInstance);

        System.out.println("最佳目标值： " + bnbSearch.solveIP());
        System.out.print("最优可行解： [");
        for (double value : IPInstance.values) {
            System.out.print(value + " ");
        }
        System.out.println("]");

        long end = System.currentTimeMillis();

        System.out.println("Timecost：" + (end - begin));



    }
}
