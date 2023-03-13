package chapter2;

/**
 * 基于下列各式编写另外的gcd算法（其中a>b）
 *
 * gcd(a，b)=2gcd(a/2，b/2)若a和b均为偶数。
 * gcd(a，b)=gcd(a/2，b)若a为偶数， b为奇数。
 * gcd(a，b)=gcd(a，b/2)若a为奇数， b为偶数。
 * gcd(a，b)=gcd((a+b)/2，(a-b)/2)若a和b均为奇数。
 */
public class text2_16 {

    /**
     * 最大公约数（欧几里得算法）
     * 假设M ≥ N，如果N < M，则循环的第一次迭代将它们互换。
     *
     * @param m
     * @param n
     * @return
     */
    public long gcd(long m, long n) {
        while (n != 0) {
            long rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }


    public long gcd2(long m, long n) {
        if ((m % 2 == 0) && ((n % 2) == 0)) {
            return 2 * gcd(m / 2, n / 2);
        } else if ((m % 2 != 0) && ((n % 2) == 0)) {
            return gcd(m / 2, n);
        } else if ((m % 2 == 0) && (n % 2 != 0)) {
            return gcd(m, n / 2);
        } else   {
            return gcd((m + n) / 2, (m - n) / 2);
        }
    }
}


