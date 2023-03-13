package chapter3;

import java.util.TreeSet;

/**
 * TreeSet的使用
 * 存储结构：红黑树
 * 要求：元素必须实现Comparable接口
 */
public class Demo12 {

    public static void main(String[] args) {

        //创建集合
        TreeSet<Person> persons = new TreeSet<>();

        //1.添加元素
        Person p1 = new Person("Jay",18);
        Person p2 = new Person("Stephen",34);
        Person p3 = new Person("Kobe",42);

        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        System.out.println(persons.size());
        System.out.println(persons);

        //2.删除
//        persons.remove(p1);
    }
}
