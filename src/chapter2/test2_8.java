package chapter2;


import java.util.Arrays;

/**
 * 随机生成数在i和j之间，生成前N个整数的一个随机置换
 */
public class test2_8 {
    public static void main(String[] args) {
        //获取开始时间
        long startTime=System.currentTimeMillis();
        int N = 100000;
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = i + 1;
        }

        System.out.println(Arrays.toString(randArray1(a)));
        System.out.println(Arrays.toString(randArray2(a)));
        System.out.println(Arrays.toString(randArray3(a)));

        long endTime=System.currentTimeMillis(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ms");


    }

    public static int randInt(int i, int j) {
        int value = (int) (i + 1 + Math.random() * (j - i + 1));
        return value;
    }

    /**
     * 算法1
     * O(n^2)
     * @param arr
     * @return
     */
    public static int[] randArray1(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = randInt(0, arr.length - 1);

            for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    arr[i] = randInt(0, arr.length - 1);
                    k = -1;
                }
            }

        }
        return arr;
    }


    //思想是数组已经赋值，通过随机函数交换里面数的位置

    /**
     * 算法2
     * O(n)
     * 用一个中间数组，来表示随机数是否已经使用
     */
    public static int[] randArray2(int[] arr) {
        int[] used = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int temp = randInt(0, arr.length - 1);
            while (used[temp - 1] != 0) {
                temp = randInt(0, arr.length - 1);
            }
            arr[i] = temp;
            used[temp - 1] = 1;
        }
        return arr;
    }

    /**
     * 算法3
     * O(n)
     * 数组已经赋值，通过随机函数交换里面数的位置
     * @param arr
     * @return
     */
    public static int[] randArray3(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < arr.length; i++) {
            swap(arr, i, randInt(0, i));
        }
        return arr;
    }


    /**
     * swap函数，互换两个变量的取值
     * @param data
     * @param a
     * @param b
     */
    public static void swap(int[] data, int a, int b) {

        int temp = data[a];
        data[a] = data[b];
        data[b] = temp;
    }
}

