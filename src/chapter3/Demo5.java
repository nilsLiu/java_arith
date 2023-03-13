package chapter3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * ArrayList的使用
 * 存储结构：数组；查找遍历速度快，增删慢
 */

public class Demo5 {
    public static void main(String[] args) {
        //创建集合

        ArrayList arrayList = new ArrayList();

        //1.添加元素
        Student s1 = new Student("Jack", 18);
        Student s2 = new Student("Mark", 10);
        Student s3 = new Student("Bob", 26);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        System.out.println("元素个数：" + arrayList.size());

        //2.删除元素
//        arrayList.remove(s1);
        arrayList.remove(new Student("Jack", 18));
        System.out.println("删除之后元素个数：" + arrayList.size());

        //3.遍历元素【重点】
        //3.1 使用迭代器
        System.out.println("-----3.1使用迭代器------");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();
            System.out.println(s);
        }
        //3.2列表迭代器
        System.out.println("-----3.1使用列表迭代器------");
        ListIterator listIterator = arrayList.listIterator();
        System.out.println("-----从前往后------");
        while (listIterator.hasNext()) {
            Student s = (Student) listIterator.next();
            System.out.println(s);
        }

        System.out.println("-----从后往前------");
        while (listIterator.hasPrevious()) {
            Student s = (Student) listIterator.previous();
            System.out.println(s);
        }

        //4.判断
        System.out.println(arrayList.contains(s1));
        System.out.println(arrayList.isEmpty());

        //5.查找
        System.out.println(arrayList.indexOf(new Student("Mark", 10)));
    }
}
