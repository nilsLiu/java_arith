package chapter3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * Collection接口的使用：
 * (1)添加元素
 * (2)删除元素
 * (3)遍历元素
 * (4)判断
 */
public class Demo1 {

    public static void main(String[] args) {
        //创建集合
        Collection collection = new ArrayList();
//                * (1)添加元素
        collection.add("apple");
        collection.add("banana");
        collection.add("strawberry");
        System.out.println("元素个数：" + collection.size());
        System.out.println(collection);
//                * (2)删除元素
//        collection.remove("banana");
//        collection.clear();
//        System.out.println("删除后的元素个数：" + collection.size());
//                * (3)遍历元素
        //3.1使用增强for
        System.out.println("________3.1使用增强for_______");
        for (Object object : collection) {
            System.out.println(object);
        }
        //3.2使用迭代器
        //hasNext();有没有下一个元素
        //next();获取下一个元素
        //remove();删除当前元素
        System.out.println("________3.2使用迭代器_______");
        Iterator it = collection.iterator();
        while (it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
            //不能使用collection删除方法
//            collection.remove(s);
//            it.remove();
        }
        System.out.println("元素个数：" + collection.size());

//                * (4)判断
        System.out.println(collection.contains("apple"));
        System.out.println(collection.isEmpty());
    }
}
