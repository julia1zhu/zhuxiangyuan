import java.util.HashMap;

/**
 * @author 朱香原
 */
public class SearchNode {

    HashMap<Integer,Integer> partialAssigned = new HashMap<>();

    public SearchNode() {
        super();
    }

    //partialAssigned 保存的是部分解的结构，就是一个HashMap，key保存的是决策变量，而value对应的是决策变量分支的取值（0-1）。
    public SearchNode(SearchNode makeCopy) {
        //把makeCopy里面保存的部分解加入了partialAssigned
        for (int test: makeCopy.partialAssigned.keySet()) {
            this.partialAssigned.put(test/*test就是key*/, makeCopy.partialAssigned.get(test)/*key对应的value*/);
        }
    }

}
