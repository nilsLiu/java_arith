package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-19  09:23
 * @Version: 1.0
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]]
 * 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。
 * <p>
 * 请你返回所有和为 0 且不重复的三元组。
 * <p>
 * 注意：答案中不可以包含重复的三元组。
 */
public class subject015 {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        /**
         * 对数组顺序排序
         * 思路：遍历第一个数，后续数中两数之和是第一位数的负数
         */

        // 顺序排序
        Arrays.parallelSort(nums);
        List<List<Integer>> ans = new ArrayList<>();


        for (int i = 0; i < nums.length - 2; i++) {
            int x = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            //当第一个数字重复时，不再遍历该数
            if (i > 0 && x == nums[i - 1]) {
                continue;
            }
            //当前三个数和大于0时，后续的数字都会大于0
            if (x + nums[i + 1] + nums[i + 2] > 0) {
                break;
            }
            //当第一位数字和最后两个数想加小于0时，遍历下一个第一位数
            if (x + nums[nums.length - 1] + nums[nums.length - 2] < 0) {
                continue;
            }
            while (left < right) {
                if (nums[left] + nums[right] == -x) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(x);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    ans.add(list);
                    left++;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    right--;
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }

                } else if (nums[left] + nums[right] > -x) {
                    right--;
                } else {
                    left++;
                }

            }

        }

        return ans;
    }

}
