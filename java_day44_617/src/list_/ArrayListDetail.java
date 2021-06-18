import java.util.ArrayList;

/**
 * @author 朱香原
 */
@SuppressWarnings({"all"})
public class ArrayListDetail {
    public static void main(String[] args) {

        // ArrayList是线程不安全的，查看源码没有synchronide
        /**
         * public boolean add(E e) {
         *         ensureCapacityInternal(size + 1);  // Increments modCount!!
         *         elementData[size++] = e;
         *         return true;
         *     }
         */
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add("jack");

        System.out.println(arrayList);
    }
}
