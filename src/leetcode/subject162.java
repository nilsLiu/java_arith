package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-21  15:53
 * @Version: 1.0
 */

/**
 * 峰值元素是指其值严格大于左右相邻值的元素。
 * <p>
 * 给你一个整数数组 nums，找到峰值元素并返回其索引。
 * 数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
 * <p>
 * 你可以假设 nums[-1] = nums[n] = -∞ 。
 * <p>
 * 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
 */
public class subject162 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int[] nums1 = {6, 5, 4, 3, 2, 3, 2};
        System.out.println(findPeakElement(nums1));
    }

    // 二分法
    public static int findPeakElement(int[] nums) {
        // [0, n-2]
        // 开区间 (-1, n-1)
        int left = -1;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[mid+1]){
                //峰顶在左侧
                right = mid;
            }else {
                //峰顶在右侧
                left = mid;

            }
        }
        return right;
    }
}
