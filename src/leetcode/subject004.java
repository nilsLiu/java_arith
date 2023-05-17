package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-15  18:54
 * @Version: 1.0
 */


/**
 * TODO
 * 寻找两个正序数组的中位数
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 */

/**
 * 寻找两个正序数组的中位数
 * 给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。
 * <p>
 * 算法的时间复杂度应该为 O(log (m+n)) 。
 */

/**
 * 题解：
 * 使用双指针的方式合并数组
 */
public class subject004 {
    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        System.out.println(findMedianSortedArrays1(nums1, nums2));

    }

    //解法一：遍历了两个数组
    public static double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int totalLength = nums1.length + nums2.length;
        int[] mergeArgs = new int[totalLength];
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                mergeArgs[i + j] = nums2[j];
                j++;
            } else {
                mergeArgs[i + j] = nums1[i];
                i++;
            }
        }
        while (i < nums1.length) {
            mergeArgs[i + j] = nums1[i];
            i++;
        }
        while (j < nums2.length) {
            mergeArgs[i + j] = nums2[j];
            j++;
        }


        if (totalLength % 2 == 0) {
            return (double) (mergeArgs[totalLength / 2] + mergeArgs[totalLength / 2 - 1]) / 2;
        } else {
            return mergeArgs[(totalLength - 1) / 2];
        }

    }

    // 解法二：二分法求解
//    public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
//
//    }
}
