package leetcode;

import java.util.Date;
import java.util.Scanner;

/**
 * 在 x 轴上有一个一维的花园。花园长度为 n，从点 0 开始，到点 n 结束。
 * <p>
 * 花园里总共有 n + 1 个水龙头，分别位于 [0, 1, ..., n] 。
 * <p>
 * 给你一个整数 n 和一个长度为 n + 1 的整数数组 ranges ，其中 ranges[i] （下标从 0 开始）表示：如果打开点 i 处的水龙头，可以灌溉的区域为 [i -  ranges[i], i + ranges[i]] 。
 * <p>
 * 请你返回可以灌溉整个花园的 最少水龙头数目 。如果花园始终存在无法灌溉到的地方，请你返回 -1 。
 */
public class subject1326 {
    public static void main(String[] args) {
        int[] ranges = {3, 4, 1, 1, 0, 0};
        System.out.println(minTaps(5, ranges));
        int n;
    }

    public static int minTaps(int n, int[] ranges) {

        for (int i = 0; i < n; i++) {
            if (i - ranges[i] <= 0 && i + ranges[i] >= n) {
                return i;
            }
        }

        return -1;
    }

}
