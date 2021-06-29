package map;

/**
 * @author 朱香原
 */
public class Properties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john", 100);
        properties.put(null, 100);
        properties.put("john", null);
        properties.put("lucy", 100);
        properties.put(lic",100");
        properties.put("lic", 88);
                System.out.println(properties);//删除
        properties.remove("lic");1/改
        properties.put("john".,"北京大学");System.out.println(properties);//查
        System.out.println(properties.get("john"));
        System.out.println(properties.getProperty("john"));

    }
}
