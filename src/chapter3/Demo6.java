package chapter3;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 演示Vector集合的使用
 * 存储结构：数组
 */
public class Demo6 {

    public static void main(String[] args) {
        //创建集合
        Vector vector = new Vector();
        //1.添加元素
        vector.add("Apple");
        vector.add("Watermelon");
        vector.add("Strawberry");
        System.out.println("元素个数：" + vector.size());

        //2.删除
//        vector.remove()

        //3.遍历
        //使用枚举器
        Enumeration elements = vector.elements();
        while (elements.hasMoreElements()){
            String o = (String) elements.nextElement();
            System.out.println(o);
        }

        //4.判断
        System.out.println(vector.contains("Apple"));
        System.out.println(vector.isEmpty());

        //5.Vector的其他方法
//        vector.firstElement();
//        vector.lastElement();
//        vector.indexOf();
    }
}
