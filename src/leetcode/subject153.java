package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-23  09:59
 * @Version: 1.0
 */

/**
 * 寻找旋转排序数组中的最小值
 * <p>
 * 已知一个长度为 n 的数组，预先按照升序排列，经由 1 到 n 次 旋转 后，得到输入数组。
 * 例如，原数组 nums = [0,1,2,4,5,6,7] 在变化后可能得到：
 * 若旋转 4 次，则可以得到 [4,5,6,7,0,1,2]
 * 若旋转 7 次，则可以得到 [0,1,2,4,5,6,7]
 * 注意，数组 [a[0], a[1], a[2], ..., a[n-1]] 旋转一次 的结果为数组
 * [a[n-1], a[0], a[1], a[2], ..., a[n-2]] 。
 * <p>
 * 给你一个元素值 互不相同 的数组 nums ，它原来是一个升序排列的数组，并按上述情形进行了多次旋转。
 * 请你找出并返回数组中的 最小元素 。
 */
public class subject153 {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
//        int[] nums1 = {2, 1};
        System.out.println(findMin(nums));
    }

    // 二分法

    public static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length -1;
        while (left < right) {
            int mid = (left + right) / 2;
            //数组 mid 小于 最右侧的数字时， 在 mid 左边找 [left, mid]
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                // 数组 mid 大于等于最右侧数据时， 在mid右边找 (mid, right]
                // 因为找的最小值必不可能 > 最右侧的数据， left 取 mid+1
                left = mid + 1;
            }

        }

        return nums[left];
    }
}