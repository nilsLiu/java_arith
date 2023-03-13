package leetcode;

/**
 *给定整数 n ，返回 所有小于非负整数 n 的质数的数量 。
 */

public class subject204 {

    public static void main(String[] args) {
        System.out.println(countPrimes(500000));
    }

    /**
     * 暴力解
     *  时间复杂度：O(N)
     *  运行时间太长，无法通过
     * @param n
     * @return
     */
    public static int countPrimes(int n) {
        int nums = 0;
        for (int i = 0; i < n; i++) {
            int value = isPrimeNumbers(i) ? 1 : 0;
            nums += value;
        }
        return nums;
    }

    public static boolean isPrimeNumbers(int N) {
        if (N == 1 || N == 0) {
            return false;
        } else if (N == 2) {
            return true;
        } else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }
}
