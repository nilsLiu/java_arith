package leetcode;

import java.util.Arrays;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target的那两个整数，并返回它们的数组下标。
 */
public class subject001 {

    public static void main(String[] args) {
        int[] a = {0, 1, 3, 5};
        System.out.println(Arrays.toString(twoSum1(a, 4)));
    }

    /**
     * 暴力枚举法：枚举数组中的每一个数 x，寻找数组中是否存在 target - x。
     * 时间复杂度：O(N^2)
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {

        int[] a = new int[0];
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (target - nums[i] == nums[j]) {
                    a = new int[]{i, j};
                }

            }
        }
        return a;
    }
    /**
     * 哈希表法
     */
//    public static int[] twoSum2(int[] nums, int target){
//
//    }

}
