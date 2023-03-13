package chapter3;


import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet的使用
 * 存储结构：红黑树
 */
public class Demo11 {

    public static void main(String[] args) {

        //创建集合
        TreeSet treeSet = new TreeSet<>();

        //1.添加元素
        treeSet.add("Apple");
        treeSet.add("Watermelon");
        treeSet.add("Banana");

        System.out.println(treeSet.size());
        System.out.println(treeSet);

        //2.删除
//        treeSet.remove("Apple");

        //3.遍历
        //3.1 增强for
        System.out.println("-----增强for----");
        for (Object o :
                treeSet) {
            System.out.println(o);
        }
        //3.2迭代器
        System.out.println("-----迭代器----");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //4.判断
        System.out.println(treeSet.contains("Banana"));
    }

}
