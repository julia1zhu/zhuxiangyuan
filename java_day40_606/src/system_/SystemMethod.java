import java.util.Arrays;

/**
 * @author 朱香原
 */
public class SystemMethod {
    public static void main(String[] args) {

        // 1.exit 退出当前程序
        System.out.println("ok1");
        //1) exit(0),表示程序退出
        //2）0表示一个状态，正常的状态
        System.exit(0);
        System.out.println("ok2");

        // 2.arraycopy :复制数组元素，比较适合底层调用，
        // 一般使用Arrays.copyOf完成复制数组
        int[] src = {1,2,3};
        int[] dest = new int[3]; // dest 当前是{0,0,0}

        // 主要要搞清楚5个参数的含义
        //     * @param      src      the source array.  ----------源数组
        //     * @param      srcPos   starting position in the source array. ------从源数组的哪个索引位置开始拷贝
        //     * @param      dest     the destination array.  -------目标数组，把源数组的数据拷贝到哪个数组
        //     * @param      destPos  starting position in the destination data.  ------把源数组的数据拷贝到目标数组的哪个索引
        //     * @param      length   the number of array elements to be copied. ---从源数组拷贝多少个数据到目标数组
        System.arraycopy(src,0,dest,0,3);
        System.out.println("dest=" + Arrays.toString(dest));

        //3. currentTimeMillens:返回当前时间距离1970-1-1的毫秒数
        System.out.println(System.currentTimeMillis());


        //4. gc:运行垃圾回收机制System.gc(）;

    }
}
