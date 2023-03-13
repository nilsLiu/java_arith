package chapter3;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet的使用
 * 存储结构：哈希表（数组+链表+红黑树）
 * 存储过程
 * （1）根据hashcode，计算保存位置，如果此位置为空，直接保存，不为空就执行第二步
 * （2）执行equals方法，如果equals为true，则认为重复，否则形成链表
 */
public class Demo10 {
    public static void main(String[] args) {

        //创建集合
        HashSet<Person> persons = new HashSet<>();
        //1.添加数据
        Person p1 = new Person("Jay",18);
        Person p2 = new Person("Stephen",34);
        Person p3 = new Person("Kobe",42);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        //重复
        persons.add(new Person("Kobe",42));

        System.out.println(persons.size());
        System.out.println(persons);

        //2.删除
        persons.remove(p1);
        System.out.println(persons);

        //3.遍历
        //3.1增强for
        System.out.println("-----增强for------");
        for (Person p:
             persons) {
            System.out.println(p);
        }
        //3.2迭代器
        System.out.println("-----迭代器------");
        Iterator iterator = persons.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //4.判断
        System.out.println(persons.contains(p3));
    }
}
