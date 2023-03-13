package chapter3;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet集合的使用
 * 存储结构：哈希表（数组+链表+红黑树）
 */
public class Demo9 {

    public static void main(String[] args) {
        //新建集合
        HashSet<String> hashSet = new HashSet<>();

        //1.添加元素
        hashSet.add("Jack");
        hashSet.add("May");
        hashSet.add("Jay");
        hashSet.add("Stephen");
//        hashSet.add("Stephen"); 不重复
        System.out.println(hashSet.size());
        //无序
        System.out.println(hashSet);

        //2.删除数据
        hashSet.remove("May");
        System.out.println(hashSet.size() + " " + hashSet);

        //3.遍历
        //3.1 增强for
        for (String s :
                hashSet) {
            System.out.println(s);
        }
        //3.2 迭代器
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //4.判断
        System.out.println(hashSet.contains("0"));
    }
}
