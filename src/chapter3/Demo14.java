package chapter3;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 要求：使用TreeSet集合实现字符串按长度排序
 * Comparator接口
 */
public class Demo14 {

    public static void main(String[] args) {
        //创建集合，添加比较规则
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = o1.length() - o2.length();
                int n2 = o1.compareTo(o2);
                return n1 == 0 ? n2 : n1;
            }
        });

        //添加数据
        treeSet.add("app");
        treeSet.add("wuhan");
        treeSet.add("stephen");
        treeSet.add("curry");
        treeSet.add("james");
        System.out.println(treeSet);
    }
}
