package leetcode;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class subject035 {

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsert(nums, 2));
    }

    public static int searchInsert(int[] nums, int target) {

        int temp = 0;
        if (nums[0] > target) {
            temp = 0;
        }
        if (nums[nums.length - 1] < target) {
            temp = nums.length;
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == target) {
                temp = i;
            }
            if (nums[i-1]<target && target<nums[i]){
                temp = i;
            }
        }

        return temp;
    }

}
