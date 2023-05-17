package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-17  14:17
 * @Version: 1.0
 */


/**
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 旋转，
 * 使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。
 * 例如， [0,1,2,4,5,6,7] 在下标 3 处经旋转后可能变为 [4,5,6,7,0,1,2] 。
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 * <p>
 * 你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
 */
public class subject033 {

    public static void main(String[] args) {
        int[] numbs = {4, 5, 6, 7, 1, 2};
        System.out.println(search(numbs, 7));
    }

    /**
     * 定理一：只有在顺序区间内才可以通过区间两端的数值判断target是否在其中。
     *
     * 定理二：判断顺序区间还是乱序区间，只需要对比 left 和 right 是否是顺序对即可，left <= right，顺序区间，否则乱序区间。
     *
     * 通过不断的用Mid二分，根据定理二，将整个数组划分成顺序区间和乱序区间，
     * 然后利用定理一判断target是否在顺序区间，如果在顺序区间，下次循环就直接取顺序区间，如果不在，那么下次循环就取乱序区间。
     * @param nums
     * @param target
     * @return
     */

    public static int search(int[] nums, int target) {
        // 当数值没有元素时
        if (nums.length == 0) {
            return -1;
        }
        // 当数组只有一个元素时
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= nums[mid]) { // 当(0,mid] 是递增数组
                if (nums[0] <= target && target < nums[mid]) { // target 在[0,mid) 存在
                    right = mid - 1;
                } else { //target 在[mid, right] 存在
                    left = mid + 1;
                }
            } else { //当(0,mid] 不是递增数组
                if (nums[mid] < target && target <= nums[right]) {  //target在(mid, right]存在
                    left = mid + 1;
                } else {    //target在[0,mid]存在
                    right = mid - 1;
                }

            }

        }
        //  nums[mid] != target
        return -1;
    }
}