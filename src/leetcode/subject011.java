package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-18  16:22
 * @Version: 1.0
 */

/**
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 * <p>
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * <p>
 * 返回容器可以储存的最大水量。
 */


public class subject011 {
    public static void main(String[] args) {
        int[] height = {1, 8, 7, 6, 1};
        System.out.println(maxArea2(height));
    }

    // 暴力解
    public static int maxArea(int[] height) {
        if (height.length <= 1) {
            return 0;
        }

        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i; j < height.length; j++) {
                if (area < (j - i) * Math.min(height[i], height[j])) {
                    area = (j - i) * Math.min(height[i], height[j]);
                }
            }
        }
        return area;

    }

    /**
     * 双指针
     * 贪心算法
     * 优化：不遍历，而采用消除短板
     *
     * @param height
     * @return
     */

    // area = (j - i) * Math.min(height[i], height[j]);
    public static int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        // 初始两为桶最两端计算面积
        int area = (right - left) * Math.min(height[left], height[right]);
        while (left != right) {
            // 从短边移动，直到遍历完成，每次计算两个边的面积记录最大面积
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
            if ((right - left) * Math.min(height[left], height[right]) > area) {
                area = (right - left) * Math.min(height[left], height[right]);
            }
        }
        return area;
    }
}
