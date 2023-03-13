package chapter1;

/**
 * 递归
 */
public class recurrence {

    public static int f1(int x) {
//        java允许递归
//        两个基本法则：
//        1.基准情况；2.不断推进
//         x = 0 为函数的基准情况
        if (x == 0) {
            return 0;
        } else {
            return 2 * f1(x-1) + x*x;
        }
    }



    public static void main(String[] args) {
        System.out.println("f1(2) = "+ f1(2));
    }

}
