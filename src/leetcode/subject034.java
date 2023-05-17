package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-16  15:35
 * @Version: 1.0
 */

import java.util.Arrays;

/**
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * <p>
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * <p>
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 */

/**
 * 题解： 二分法
 */
public class subject034 {
    public static void main(String[] args) {
        int[] arg = {5, 7, 8, 8, 10};
        System.out.println(Arrays.toString(searchRange(arg, 8)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = findLeftBound(nums, target);
        if (left == nums.length || nums[left] != target)
            return new int[]{-1, -1};
        int right = findLeftBound(nums, target + 1) - 1;
        return new int[]{left, right};
        //找target左边界，left为target的左边界，right为target+1的 左边界-1
    }


    private static int findLeftBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else
                right = mid - 1;

        }
        return left;
    }

}
