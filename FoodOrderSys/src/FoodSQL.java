import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author 朱香原
 */
@SuppressWarnings("all")
public class FoodSQL {
        static List<String> foodName = new LinkedList<>();
        static List<String> foodScale = new LinkedList<>();
        static List<Double> foodPrice = new LinkedList<>();
        static List<String> foodSpecification = new LinkedList<>();
        static List<Integer> foodNumber = new LinkedList<>();
        static List<Integer> foodConsuming = new LinkedList<>();

        public FoodSQL() {
            foodName.addAll(Arrays.asList(
                    "水饺",        "水饺",     "水饺",
                    "汤饺",        "汤饺",
                    "米饭",        "米饭",
                    "面条",        "面条",     "面条",
                    "饹豆子",      "饹豆子",
                    "鸡蛋炒面",    "火腿炒面",    "肉炒面",
                    "鸡蛋炒饭",    "扬州炒饭",
                    "担担面",      "担担面",
                    "鲤鱼",        "鲤鱼",     "鲤鱼",
                    "刀鱼",        "刀鱼",     "刀鱼",
                    "小黄花",      "小黄花",
                    "青鱼",        "青鱼"
            ));

            foodScale.addAll(Arrays.asList(
                    "素三鲜", "酸菜", "猪肉",
                    "素",     "肉",
                    "大",     "小",
                    "大",     "中",    "小",
                    "大",     "小",
                    " ",      " ",     " ",
                    " ",      " ",
                    "大",     "小",
                    "豆瓣",   "红烧 ",  "家炖 ",
                    "干炸",   "红烧 ",  "家炖 ",
                    "干炸",   "干煎 ",
                    "干煎 ",   "家炖 "
             ));
             double[] price = {
                    12, 12, 16,
                    5,  7,
                    3,  2,
                    4,  3,  2,
                    3,  2,
                    6,  6,  7,
                    6,  7,
                    5,  4,
                    30, 30, 30,
                    16, 16, 16,
                    30, 30,
                    30, 30};
            for (int i = 0; i < price.length; i++) {
                foodPrice.add(price[i]);

            }


            foodSpecification.addAll(Arrays.asList(
                    "元/斤",     "元/斤",     "元/斤",
                    "元/碗",     "元/碗",
                    "元/碗",     "元/碗",
                    "元/碗",     "元/碗",     "元/碗",
                    "元/碗",     "元/碗",
                    "元/盘",     "元/盘",     "元/盘",
                    "元/盘",     "元/盘",
                    "元/碗",     "元/碗",
                    "元/份",     "元/份",     "元/份",
                    "元/份",     "元/份",     "元/份",
                    "元/份",     "元/份",
                    "元/份",     "元/份"));

            int[] number = {
                    50, 50, 50,
                    50, 50,
                    50, 50,
                    5,  3,  2,
                    3,  2,
                    6,  6,  7,
                    6,  7,
                    5,  4,
                    30, 30, 30,
                    16, 16, 16,
                    30, 30,
                    30, 30};
            for (int i = 0; i < number.length; i++) {
                foodNumber.add(number[i]);
            }

            for(int i = 0;i < number.length;i++){
                foodConsuming.add(0);
            }
        }

        public int foodSize() {
            return 19;
        }

        public int fishSize() {
            return 28;
        }

}

