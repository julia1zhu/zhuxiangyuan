import ilog.concert.IloException;
import ilog.concert.IloNumExpr;
import ilog.concert.IloNumVar;
import ilog.concert.IloNumVarType;
import ilog.cplex.IloCplex;


/**
 * @author 朱香原
 */
@SuppressWarnings("all")
public class IPInstance {

    public IPInstance() {
    }

    public static int count = 1; //迭代次数
    public static int numTests = 14;//变量个数
    public static double[] values;


    //开始分支定界后进行求解的方法
    public double solve(SearchNode node) {
        try {
            IloCplex cplex = new IloCplex();

            IloNumVarType[] switcher = new IloNumVarType[2];  //变量类型种数

            switcher[0] = IloNumVarType.Int;
            switcher[1] = IloNumVarType.Float;
            int flag = 1;

            //目标函数价值系数
//            double[] costOfTest = {7,12,5,14};
              double[] costOfTest = {200,3,20,50,70,20,5,10,200,150,18,8,300,185};

            /**
             * IloNumVar[]:变量数组
             * numTests:变量的个数
             * 0：变量下界
             * 1：变量上界
             * switcher[flag]：变量类型
             */
            IloNumVar[] testUsed = cplex.numVarArray(numTests, 0, 1, switcher[flag]);

            IloNumExpr objectiveFunction = cplex.scalProd(testUsed, costOfTest);

            cplex.addMaximize(objectiveFunction);


            //这个约束系数应该是一个矩阵  二维数组  不包括右边常数项
            double[][] constraint = {{6,2,3,0,0,0,1,0,4,0,0,5,0,0},{0,3,5,0,5,0,8,0,5,8,0,7,1,4},{0,0,0,0,8,1,0,0,0,4,2,0,4,5},
                    {0,0,0,0,0,8,0,5,0,0,7,0,1,3},{0,0,0,10,0,4,0,0,0,0,0,0,1,3},{0,0,0,1,1,0,0,0,0,0,0,0,0,0},
                    {0,0,0,0,0,0,0,1,0,0,1,0,0,0},{0,0,0,0,0,0,0,0,1,0,0,0,0,1},{0,-1,0,0,0,0,0,0,0,0,1,0,0,0},
                    {0,0,-1,1,0,0,0,0,0,0,0,0,0,0},{0,0,-1,0,1,0,0,0,0,0,0,0,0,0},{0,0,-1,0,0,1,0,0,0,0,0,0,0,0},
                    {0,0,-1,0,0,0,1,0,0,0,0,0,0,0}};
            double[] term = {10,12,14,14,14,1,1,1,0,0,0,0,0};
//
//            double[][] constraint = {{300,600,500,1600}};
//            double[] term = {700};

            //加入约束，加入的是原模型中的不等式约束
            IloNumExpr diffConstraint = cplex.numExpr();
            //这里求出的是共有多少个约束
            for(int i = 0;i < constraint.length;i++){
                diffConstraint = cplex.scalProd(constraint[i],testUsed);

                for(int j = 0;j < term.length;j++){
                    if(j==i){
                        cplex.addLe(diffConstraint, term[j]);
                        break;
                    }
                }
            }

            //加入约束，加入的是等式约束,也就是部分解确定之后的约束
            for (int test : node.partialAssigned.keySet()) {
                cplex.addEq(testUsed[test], node.partialAssigned.get(test));
            }

            System.out.println(cplex.getModel());
            cplex.exportModel((count++) +".lp");  //保留每一次迭代的松弛模型
            //进行求解
            if (cplex.solve()) {
                //得到最优目标值
                double objectiveValue = (cplex.getObjValue());
                values = cplex.getValues(testUsed);
//                for (double value : IPInstance.values) {
//                    System.out.print(value + " ");
//                }

                return objectiveValue;
            }



        } catch (IloException e) { //不可行
            System.out.println("Error " + e);
        }
        return 0;

    }

}
