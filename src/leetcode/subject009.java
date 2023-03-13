package leetcode;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 */


public class subject009 {


    public static void main(String[] args) {
        System.out.println(isPalindrome(1121));
        System.out.println(isPalindrome1(1231));
    }

    /**
     * 使用字符串反转来判断
     * @param x
     * @return
     */
    public static boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        //使用StringBuffer类中的reverse函数反转字符串
        StringBuffer stringBuffer = new StringBuffer(s);
        String m = stringBuffer.reverse().toString();
        if (m.equals(s)){
            return true;
        }else {
            return false;
        }
    }

    /**
     *反转一半数字
     * 对于数字 1221，如果执行 1221 % 10，我们将得到最后一位数字 1，
     * 要得到倒数第二位数字，我们可以先通过除以 10 把最后一位数字从 1221 中移除，1221 / 10 = 122，
     * 再求出上一步结果除以 10 的余数，122 % 10 = 2，就可以得到倒数第二位数字。
     * 如果我们把最后一位数字乘以 10，再加上倒数第二位数字，1 * 10 + 2 = 12，就得到了我们想要的反转后的数字。
     * 如果继续这个过程，我们将得到更多位数的反转数字。
     * @param x
     * @return
     */
    public static boolean isPalindrome1(int x){

        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int reNub = 0;
        while (x > reNub){
            reNub = reNub * 10 + x % 10;
            x /= 10;
        }
        return reNub == x || reNub/10 == x;
    }
}
