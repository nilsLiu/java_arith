package chapter3;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList的使用
 * 存储结构：双向链表
 */
public class Demo7 {

    public static void main(String[] args) {
        //集合创建
        LinkedList linkedList = new LinkedList<>();

        //1.添加元素
        Student s1 = new Student("Jack", 18);
        Student s2 = new Student("Mark", 10);
        Student s3 = new Student("Bob", 26);
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        System.out.println("元素个数：" + linkedList.size());
        System.out.println(linkedList);

        //2.删除
//        linkedList.remove();

        //3.遍历
        //3.1 for遍历
        System.out.println("------for------");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }

        //3.2增强for
        System.out.println("------增强for------");
        for (Object o :
                linkedList) {
            Student s = (Student) o;
            System.out.println(s.toString());
        }
        //3.3列表迭代器
        System.out.println("------使用列表迭代器------");
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            Student s = (Student) listIterator.next();
            System.out.println(s.toString());
        }

        //4.判断
        System.out.println(linkedList.contains(s1));

        //5.获取
        System.out.println(linkedList.indexOf(s2));

    }


}
