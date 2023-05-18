package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-18  19:58
 * @Version: 1.0
 */

/**
 * 给你一个整数数组 nums 和一个整数 k ，
 * 请你返回子数组内所有元素的乘积严格小于 k 的连续子数组的数目。
 *
 * 输入：nums = [10,5,2,6], k = 100
 * 输出：8
 */
public class subject713 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(numSubarrayProductLessThanK(nums, 0));
    }

    // 双指针

    public static int numSubarrayProductLessThanK(int[] nums, int k) {

        int left = 0;
        //初始值1
        int prod = 1;
        int ans = 0;
        // 排除k 为 0,1 的情况
        if (k <= 1){
            return 0;
        }
        // 右指针移动
        for (int right = 0; right < nums.length; right++) {
            prod *= nums[right];
            while (prod >= k) {
                //当大于等于k，左指针右移并把之前左指针的数除掉
                prod /= nums[left];
                left++;
            }

            ans += right - left + 1;

        }
        return ans;

    }
}
