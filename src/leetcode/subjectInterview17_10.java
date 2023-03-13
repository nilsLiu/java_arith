package leetcode;

import java.util.ArrayList;

/**
 * 数组中占比超过一半的元素称之为主要元素。给你一个 整数 数组，找出其中的主要元素。若没有，返回 -1 。
 *
 *
 */
public class subjectInterview17_10 {

    public static void main(String[] args) {
        int[] a = {1,2,2,1,2,3};
        System.out.println((majorityElement(a)));
    }

    /**
     * 暴力解
     * 思路：
     * 将数组导入到ArrayList中，创建判断是否有主要元素的判断符boolean类b
     * 从list中遍历元素，相同元素则自加1存入count中
     * 若count大于数组长度的1/2，则输出为主要元素
     * 否则 输出为-1
     * 每次遍历的元素加入到list2中，存在相同元素时就不重复遍历
     * @param nums
     * @return
     */
    public static int majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
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
                }
                else {list1.add(a);}
            }
        }
        if (!b){
            return -1;
        }

        return a;
    }
}
