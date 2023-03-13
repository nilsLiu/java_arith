package chapter3;

import java.util.*;

/**
 * Collections工具类的使用
 */
public class Demo18 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(40);
        list.add(10);
        list.add(70);
        list.add(50);
        list.add(100);
        //1.sort排序(默认升序)
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        //2.binarySearch查找
        int i = Collections.binarySearch(list, 70);
        System.out.println(i);

        //3.copy复制
        ArrayList<Integer> dest = new ArrayList<>();
        //保证两个集合的大小相同
        for (int j = 0; j < list.size(); j++) {
            dest.add(0);
        }
        Collections.copy(dest, list);
        System.out.println(dest);

        //4.revers反转
        Collections.reverse(list);
        System.out.println(list);

        //5.shuffle打乱
        Collections.shuffle(list);
        System.out.println(list);

        //6.list转成数组
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array));

        //7.数组转成集合
        String[] name = {"kobe", "jay", "hobe"};
        //集合是受限集合，不能添加和删除元素 （list2.add() | list2.remove()）
        List<String> list2 = Arrays.asList(name);
        System.out.println(list2);

        //基本类型数组转为集合时，要修改为包装类型
        Integer[] nums = {1,2,3,4};
        List<Integer> list3 = Arrays.asList(nums);
        System.out.println(list3);
    }
}
