package chapter3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set接口的使用
 * 特点：1.无序，没有下标；2.不能重复
 */
public class Demo8 {

    public static void main(String[] args) {

        //创建集合
        Set<String> set = new HashSet<>();
        //1.添加数据
        set.add("Apple");
        set.add("Huawei");
        set.add("Xiaomi");
        System.out.println("数据个数：" + set.size());
        System.out.println(set);

        //2.删除数据
        set.remove("Xiaomi");
        System.out.println(set);

        //3.遍历
        //3.1增强for
        System.out.println("----使用增强for----");
        for (String s :
                set
        ) {
            System.out.println(s);
        }
        //3.2迭代器
        System.out.println("----使用迭代器----");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //4.判断
        System.out.println(set.contains("Apple"));
    }
}
