package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-19  15:27
 * @Version: 1.0
 */

/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */
public class subject042 {

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trap(height1));
    }

    // 前后缀分解
    // 时间复杂度 O(n)
    public static int trap(int[] height) {
        int[] a = new int[height.length];
        int[] b = new int[height.length];
        int sum = 0;
        a[0] = height[0];
        for (int i = 1; i < height.length; i++) {

            a[i] = Math.max(height[i], a[i - 1]);
        }

        b[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {

            b[i] = Math.max(height[i], b[i + 1]);
        }

        for (int i = 0; i < height.length; i++) {
            sum += Math.min(a[i], b[i]) - height[i];
        }
        return sum;
    }
}
