package chapter3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * List子接口的使用
 * 特点：1.有序，有下标；2.可重复
 */
public class Demo3 {
    public static void main(String[] args) {

        //创建集合对象
        List list = new ArrayList<>();

        //1.添加元素
        list.add("Apple");
        list.add("Huawei");
        list.add(0, "Xiaomi");
        System.out.println("元素个数:" + list.size());
        System.out.println(list);

        //2.删除元素
//        list.remove("Apple");
//        list.remove(0);
//        System.out.println("____________删除之后____________");
//        System.out.println("元素个数：" + list.size());
//        System.out.println(list);

        //3.遍历
        //3.1使用for遍历
        System.out.println("____________3.1使用for遍历____________");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        //3.2使用增强for
        System.out.println("____________3.2使用增强for____________");
        for (Object object : list) {
            System.out.println(object);
        }

        //3.3使用迭代器
        System.out.println("____________3.3使用迭代器____________");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //3.4使用列表迭代器,区别于Iteration，可以向前，向后遍历，添加、删除、修改元素
        System.out.println("____________3.4使用列表迭代器____________");
        ListIterator listIt = list.listIterator();
        System.out.println("____________从前往后____________");
        while (listIt.hasNext()) {
            System.out.println(listIt.nextIndex() + ":" + listIt.next());
        }
        System.out.println("____________从后往前____________");
        while (listIt.hasPrevious()) {
            System.out.println(listIt.previousIndex() + ":" + listIt.previous());
        }

        //4.判断
        System.out.println(list.contains("Apple"));
        System.out.println(list.isEmpty());

        //5.获取位置
        System.out.println(list.indexOf("Huawei"));
    }
}
