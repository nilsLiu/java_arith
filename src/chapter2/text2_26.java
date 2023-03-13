package chapter2;

import chapter1.generic4.Pair;
import jdk.nashorn.internal.ir.IfNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class text2_26 {

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 2, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            list.add(a[i]);
        }
        System.out.println(majorSum1(list));
        System.out.println(majorSum2(a));
    }

    /**
     * 暴力解
     * 思路：
     * 将数组导入到ArrayList中，创建判断是否有主要元素的判断符boolean类 b
     * 从list中遍历元素，相同元素则自加1存入count中
     * 若count大于数组长度的1/2，则输出为主要元素
     * 否则 输出为-1
     * 每次遍历的元素加入到list2中，存在相同元素时就不重复遍历
     *
     * @return
     */
    public static int majorSum1(ArrayList<Integer> list) {

        int len = list.size();
        boolean b = false;
        ArrayList<Integer> list1 = new ArrayList<>();

        int a = 0;
        int count;
        for (int i = 0; i < len; i++) {
            a = list.get(i);
            if (!list1.contains(a)) {
                count = 0;
                for (int j = 0; j < len; j++) {
                    if (list.get(j) == a) {
                        count++;
                    }
                }

                if (count > len / 2) {

                    b = true;
                    return a;
                } else {
                    list1.add(a);
                }
            }
        }
        if (!b) {
            return -1;
        }
        return a;
    }

    /**
     * 哈希表法
     * 哈希表进行计数，如果发现某个元素数量超过总数一半，则输出主元素
     * @param nums
     * @return
     */
    public static int majorSum2(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;


        for (int i :nums)  {
            map.put(i, map.getOrDefault(i, 0) + 1);
            if (map.get(i) > len / 2) {
                return i;
            }

        }return -1;
    }

}
