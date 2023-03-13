package chapter3;

import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap的使用
 */
public class Demo17 {

    public static void main(String[] args) {
        //新建集合
        TreeMap<Person, String> treeMap= new TreeMap<Person, String>();

        //1.添加元素
        Person p1 = new Person("Jay",18);
        Person p2 = new Person("Stephen",34);
        Person p3 = new Person("Kobe",42);
        treeMap.put(p1, "beijing");
        treeMap.put(p2, "chongqing");
        treeMap.put(p3, "shanghai");
        System.out.println(treeMap.size());
        System.out.println(treeMap);

        //2.删除：remove

        //3.遍历
        //3.1keySet遍历
        System.out.println("-----3.1keySet遍历-------");
        for (Person p :
                treeMap.keySet()) {
            System.out.println(p + treeMap.get(p));
        }

        //3.2entrySet遍历
        System.out.println("-----3.2entrySet遍历-------");
        for (Map.Entry<Person, String> entry :
                treeMap.entrySet()) {
            System.out.println(entry);
        }

        //4.判断
    }
}
