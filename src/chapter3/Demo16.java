package chapter3;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMAp的使用
 * 数据结构：哈希表（数组+链表+红黑树）
 */
public class Demo16 {
    public static void main(String[] args) {
        //创建集合
        HashMap<Person, String> persons = new HashMap<Person, String>();

        //1.添加元素
        Person p1 = new Person("Jay", 18);
        Person p2 = new Person("Stephen", 34);
        Person p3 = new Person("Kobe", 42);
        persons.put(p1, "shanghai");
        persons.put(p2, "beijing");
        persons.put(p3, "nanjing");
        //重写hashcode和equals方法
        persons.put(new Person("Kobe", 42), "shanghai");
        System.out.println(persons.size());
        System.out.println(persons);

        //2.删除：remove

        //3.遍历
        //3.1使用keySet()
        System.out.println("-----使用keySet()-----");
        for (Person key :
                persons.keySet()) {
            System.out.println(key + "--------" + persons.get(key));
        }
        //3.2使用entrySet()
        System.out.println("-----使用entrySet()-----");
        for (Map.Entry<Person, String> entry :
                persons.entrySet()) {
            System.out.println(entry.getKey()+"-----"+entry.getValue());
        }
    }
}
