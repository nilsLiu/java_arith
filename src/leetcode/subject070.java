package leetcode;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 * <p>
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class subject070 {

    public static void main(String[] args) {

        System.out.println(climbStairs(3));
    }

    /**
     * 动态规划
     * f（n） = f（n-1） + f（n-2）
     *
     * @param n
     * @return
     */
    public static int climbStairs(int n) {

        int a = 0, b = 0, c = 1;
        for (int i = 1; i <= n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}

