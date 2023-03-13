package chapter2;

/**
 *
 */
public class test2_20 {
    public static void main(String[] args) {
        System.out.println(isPrimeNumbers(74));
        int value = isPrimeNumbers(74)? 1:0;
        System.out.println(value);
    }

    /**
     * 判断 N 是否为质数
     * @param N
     * @return
     */
    public static boolean isPrimeNumbers(int N){
        if (N == 1 || N==0 ) {
            return false;
        }

        else if (N == 2){
            return true;
        }
        else {
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    return false;
                }
            }return true;
        }
    }
}
