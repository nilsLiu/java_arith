package chapter2;



/**
 * 给定一个实数序列x1,x2,x3.......xn，寻找一个连续的子序列xi......xj使其数组之和在所有连续子序列数值之和中时最大的，这个子序列称为最大子序列
 */

public class maxSubsum {

    public static void main(String[] args) {
        int array[] = {4, -3, 5, -2, -1, 2, 6, -2};
        int sum1 = maxSubSum1(array);
        int sum2 = maxSubSum2(array);
        int sum3 = maxSubSum3(array, 0, array.length-1);
        int sum4 = maxSubSum4(array);
        int sum5 = maxSubSum5(array);
        System.out.println("maxSum1 = " + sum1);
        System.out.println("maxSum2 = " + sum2);
        System.out.println("maxSum3 = " + sum3);
        System.out.println("maxSum4 = " + sum4);
        System.out.println("maxSum5 = " + sum5);

    }

    public static int maxSubSum1(int[] a){
        // O(N³)
        int maxSum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                int thisSum = 0;

                for (int k = i; k < j; k++) {
                    thisSum += a[k];
                }
                if (thisSum > maxSum){
                    maxSum = thisSum;
                }
            }
        }
        return maxSum;
    }

    public static int maxSubSum2(int[] a){
        //O(N²)
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            int thisSum = 0;

            for (int j = i; j <a.length; j++) {
                thisSum += a[j];

                if (thisSum > maxSum){
                    maxSum = thisSum;
                }
            }
        }return maxSum;
    }

    /**
     * 左右分开解决思路
     * @param a
     * @param left 左边界
     * @param right 右边界
     * @return
     */
    public static int maxSubSum3(int[] a, int left, int right) {

        //O（NlogN）
        //仅有一个元素的情况
        if (left == right) {
            if (a[left] > 0) {
                return a[left];
            } else {
                return 0;
            }
        }

        int center = (left + right) / 2;

        int maxLeftSum = maxSubSum3(a, left, center);
        int maxRightSum = maxSubSum3(a, center + 1, right);

        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for (int i = center; i >= left; i--) {
             leftBorderSum += a[i];
            if (leftBorderSum > maxLeftBorderSum){
                maxLeftBorderSum = leftBorderSum;
            }
        }

        int maxRightBorderSum = 0, rightBorderSum = 0;
        for (int i = center + 1; i <= right ; i++) {
            rightBorderSum += a[i];
            if (rightBorderSum > maxRightBorderSum){
                maxRightBorderSum = rightBorderSum;
            }
        }


        return Math.max(Math.max(maxLeftSum, maxRightSum) , maxLeftBorderSum + maxRightBorderSum);
    }

    private static int maxSubSum4(int[] a){
        int maxSum = 0;
        int thisSum = 0;

        for (int i = 0; i < a.length; i++) {
            thisSum += a[i];

            if (thisSum > maxSum) {
                maxSum = thisSum;
            } else if (thisSum < 0) {
                thisSum = 0;
            }
        }

        return maxSum;
    }


    /**
     * 最优
     * 贪心算法
     * @param a
     * @return
     */
    private static int maxSubSum5(int[] a){
        int thisSum = 0;
        int maxSum = a[0];
       for (int i = 0; i < a.length; i++) {
           thisSum = Math.max(thisSum + a[i], a[i]);
           maxSum = Math.max(maxSum, thisSum);
        }
       return maxSum;
    }
}
