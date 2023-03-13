package chapter3;

import java.util.ArrayList;
import java.util.List;

/**
 * List的使用
 */
public class Demo4 {
    public static void main(String[] args) {

        //创建集合
        List list = new ArrayList();

        //1.添加数字数据(自动装箱)
        list.add(10);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(100);
        System.out.println("元素个数：" + list.size());
        System.out.println(list);

        //2.删除操作
//        list.remove((Object) 20);
//        list.remove(2);

        //3.补充方法subList的使用，返回子集合,含头不含尾
        List subList = list.subList(1, 3);
        System.out.println(subList);
    }
}
