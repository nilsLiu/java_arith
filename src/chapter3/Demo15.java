package chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map接口的使用
 * 特点：1.残差键值对 2.键不能重复，值可以重复 3.无序
 */
public class Demo15 {
    public static void main(String[] args) {

        //创建Map集合
        Map<String, String> map = new HashMap<>();

        //1.添加元素
        map.put("cn", "中国");
        map.put("jp", "日本");
        map.put("usa", "美国");
        System.out.println(map.size());
        System.out.println(map);

        //2.删除
//        map.remove("usa");
//        System.out.println(map);

        //3.遍历
        //3.1使用keySet();
        Set<String> keyset = map.keySet();
        for (String key :
                keyset) {
            System.out.println(key + "---" + map.get(key));
        }
        //3.2使用entrySet 映射对
        //Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : map.entrySet()
        ) {
            System.out.println(entry.getKey() + "---" + entry.getValue());
        }

        //4.判断
        System.out.println(map.containsKey("cn"));
        System.out.println(map.containsValue("中国"));
    }
}
