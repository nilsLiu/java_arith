package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-18  18:09
 * @Version: 1.0
 */

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其和 ≥ target 的长度最小的
 * 连续子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，
 * 并返回其长度。如果不存在符合条件的子数组，返回 0 。
 */


public class subject209 {
    public static void main(String[] args) {
        int[] nums = {1, 4, 4};
        System.out.println(minSubArrayLen(5, nums));
    }


    //  双指针 复杂度 O(n)
    //  满足单调性

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int ans = nums.length + 1;
        // 遍历右指针
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            //当数组和去掉最左端元素也满足target条件时， 左指针即可向右移，
            while (sum - nums[left] >= target) {
                sum -= nums[left];
                left++;
            }
            if (sum >= target) {
                // 取左右指针区间元素的最小值
                ans = Math.min(ans, i - left + 1);
            }
        }
        // 判断子数组长度不能长于数组长度
        return ans <= nums.length ? ans : 0;
    }
}
