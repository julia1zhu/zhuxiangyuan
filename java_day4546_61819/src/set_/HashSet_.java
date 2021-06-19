package set_;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author 朱香原
 */
@SuppressWarnings({"all"})
public class HashSet_ {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        /*
          1. HashSet实际上是HashMap，看下源码. (图)
	        public HashSet() {
             map = new HashMap<>( );
            }
         */
      // 2. 可以存放null值，但是只能有一个null
        hashSet.add(null);
        hashSet.add(null);
        System.out.println("hashSet=" + hashSet);
    }
}
