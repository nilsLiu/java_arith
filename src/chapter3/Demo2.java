package chapter3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection的使用：保存学生信息
 */
public class Demo2 {

    public static void main(String[] args) {
        //新建Collection对象
        Collection collection = new ArrayList();
        Student s1 = new Student("Jack", 28);
        Student s2 = new Student("Bob", 19);
        Student s3 = new Student("Marry", 16);
        //1.添加数据
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        System.out.println("元素个数：" + collection.size());
        System.out.println(collection.toString());
        //2.删除
//        collection.remove(s1);
//        collection.clear();
//        System.out.println("元素个数：" + collection.size());
        //3.遍历
        //3.1增强for
        for (Object object:
             collection) {
            Student s = (Student) object;
            System.out.println(s.toString());
        }
        //3.2 迭代器：hasNext(); next(); remove();
        Iterator it = collection.iterator();
        while (it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.toString());
        }
        //4.判断
        System.out.println(collection.contains(s1));
        System.out.println(collection.isEmpty());
    }
}
