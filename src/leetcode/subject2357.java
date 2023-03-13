package leetcode;

import java.util.ArrayList;

/**
 * 使数组中所有元素都等于零
 * 给你一个非负整数数组 nums 。在一步操作中，你必须：
 * 选出一个正整数 x ，x 需要小于或等于 nums 中 最小 的 非零 元素。
 * nums 中的每个正整数都减去 x。
 * 返回使 nums 中所有元素都等于 0 需要的 最少 操作数。
 */
public class subject2357 {

    //思路：数组共存在n个不同数，除去0外，至少需要n步才能全部归零
    public int minimumOperations(int[] nums) {
        int length = nums.length;
        ArrayList<Integer> list = new ArrayList<>();

        // 找出数组中所有不同数字放入list中
        for (int i = 0; i < length; i++) {
            if (!list.contains(nums[i])) {
                list.add(nums[i]);
            }
        }

        // 存在0的情况，少一步归零
        if (list.contains(0)) {
            return list.size() - 1;
        }
        return list. size();
    }
}


