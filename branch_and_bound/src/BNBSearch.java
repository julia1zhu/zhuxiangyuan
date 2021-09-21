import ilog.concert.IloException;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author 朱香原
 */
@SuppressWarnings("all")
public class BNBSearch {

    //采用了栈结构，是后进先出。适用于深度优先搜索原则的分支定界
    Deque<SearchNode> searchStack = new ArrayDeque<>();   //构造和遍历生成树用的，栈结构。
    double bestVal = Double.MIN_VALUE; //记录当前最优解的值，由于求的最大化问题，一开始设置为负无穷。
    SearchNode currentBest = new SearchNode();//记录当前最优解。
    IPInstance solveRel = new IPInstance();// 整数规划模型。
    Deque<SearchNode> visited = new ArrayDeque<>();//记录此前走过的分支，避免重复。
    int varToSplit;

    public BNBSearch(IPInstance solveRel) {
        this.solveRel = solveRel;
        SearchNode rootNode = new SearchNode();
        this.searchStack.push(rootNode);  //进栈
    }

    /**
     * 能不能再进行分支，如果可以，选择哪个变量进行分支
     * @param branchNode
     * @return
     */
    public static int getSplitVariable(SearchNode branchNode){
        for(int i = 0;i < IPInstance.values.length;i++){
            if((IPInstance.values[i] - 0) != 0 && (IPInstance.values[i] - 1) != 0){
                return i;
            }
        }
        return -1;
    }

    /**
     * 选择哪个点进行搜索
     * @return
     * @throws IloException
     */
    public int solveIP() throws IloException {
        while (!this.searchStack.isEmpty()) {  ////在弹出时应判断栈是否为空栈，空栈则无数据可弹出
            SearchNode branchNode = this.searchStack.pop();//数据弹出，每次只能弹出栈顶数据，也就是一个数据。
            boolean isVisited = false;

            for (SearchNode tempNode : this.visited) {
                if (branchNode.partialAssigned.equals(tempNode.partialAssigned)) {
                    isVisited = true;
                    break;
                }
            }

            if (!isVisited) {
                visited.add(new SearchNode(branchNode));  //首先将这个节点加入到已经访问过得节点集里面去
                /**
                 * 将这个节点的约束带入原模型中进行求解
                 * 得到节点的一个解和目标值
                 */

                double bound = solveRel.solve(branchNode);  //这个规划模型，加入节点的约束，然后进行求解，求解会得出一个值
                if (bound < bestVal || bound == 0) {  //如果这个值比当前最佳值差或者不可行
                    continue;
                }
                if (bound > bestVal && bound != 0) {  //bound是返回的目标值，目标值里面是更好的，且分支没有到低端
                    //如果还没到达低端，找一个变量进行分支.也就是说找到的数里面还有小数
                      // if (branchNode.partialAssigned.size() != solveRel.numTests) {
                       //写一个方法，是确定到底在选取哪个变量进行分支的,返回的int应该是决策变量的下标
                   varToSplit = getSplitVariable(branchNode);
                   if(varToSplit == -1){
                        this.bestVal = bound;
                        this.currentBest = branchNode;
                        continue;
                   }else{ //分支
                        SearchNode left = new SearchNode(branchNode);
                        SearchNode right = new SearchNode(branchNode);
                        left.partialAssigned.put(varToSplit, 0);
                        right.partialAssigned.put(varToSplit, 1);
                        this.searchStack.push(left);  //进栈
                        this.searchStack.push(right);  //这个是后放进去的
                        }
                    }
                }
            }

        return (int)bestVal;
    }
}
