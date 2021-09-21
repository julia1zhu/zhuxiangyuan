import ilog.concert.*;
import ilog.cplex.IloCplex;

public class Test01 {
        public static void main(String[] args) {
            long start = System.currentTimeMillis();
            solve();
            long end = System.currentTimeMillis();

            System.out.println("costTime = " + (end - start));
        }
        public static void solve(){
            try {
                IloCplex cplex = new IloCplex();

                //3个0-1取值
                IloIntVar[] x = cplex.boolVarArray(14);

                //目标函数价值系数
                double[] costOfTest = {200,3,20,50,70,20,5,10,200,150,18,8,300,185};

                //右端常数项
                double[] term = {10,12,14,14,14,1,1,1,0,0,0,0,0};

                double[][] cons = {{6,2,3,0,0,0,1,0,4,0,0,5,0,0},{0,3,5,0,5,0,8,0,5,8,0,7,1,4},{0,0,0,0,8,1,0,0,0,4,2,0,4,5},
                        {0,0,0,0,0,8,0,5,0,0,7,0,1,3},{0,0,0,10,0,4,0,0,0,0,0,0,1,3},{0,0,0,1,1,0,0,0,0,0,0,0,0,0},
                        {0,0,0,0,0,0,0,1,0,0,1,0,0,0},{0,0,0,0,0,0,0,0,1,0,0,0,0,1},{0,-1,0,0,0,0,0,0,0,0,1,0,0,0},
                        {0,0,-1,1,0,0,0,0,0,0,0,0,0,0},{0,0,-1,0,1,0,0,0,0,0,0,0,0,0},{0,0,-1,0,0,1,0,0,0,0,0,0,0,0},
                        {0,0,-1,0,0,0,1,0,0,0,0,0,0,0}};

                //约束
                for(int i = 0;i <cons.length;i++){
                    cplex.addLe(cplex.scalProd(x,cons[i]),term[i]);
                }

                //目标函数
                cplex.addMaximize(cplex.scalProd(x, costOfTest));


                cplex.exportModel("l.lp");
                // 求解
                if (cplex.solve()) {
                    System.out.println("Solution status = " + cplex.getStatus());
                    System.out.println("Solution value  = " + cplex.getObjValue());
                    for (double value : cplex.getValues(x)) {
                        System.out.println(value);
                    }
                }

                cplex.end();
            } catch (IloException e ) {
                e.printStackTrace();
            }

        }


}


