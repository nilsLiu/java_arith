package chapter2;

/**
 * 给出有效的算法
 * a.求最小子序列和。
 * b.求最小的正子序列和。
 * c.求最大子序列乘积。
 */
public class test2_17 {

    public static void main(String[] args) {
        int array[] = {4, -3, 5, -2, -1, 2, 6, -2};
        System.out.println("the minSubSum is: " + minSubSum(array));
        System.out.println("the minPositiveSumSubSum is: " + minPositiveSubSum(array));
        System.out.println("the maxProduct is: " + maxProduct(array));
    }


    /**
     * 贪心算法
     * @param nums
     * @return
     */
    public static int minSubSum(int[] nums){
        int thisSum = 0;
        int minSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            thisSum = Math.min(thisSum + nums[i],nums[i]);
            minSum = Math.min(minSum, thisSum);
        }
        return minSum;
    }

    /**
     *  * 最小正子序列和：1.连续子序列，2.序列和为正且最小
     *      * 思路：
     *      * 遍历所有数组和，找到大于0且最小的和
     * @param arr
     * @return
     */
    public static int minPositiveSubSum(int[] arr) {

        int thisSum;
        int minPositiveSum = arr[0];
        int len = arr.length;
        for (int i = 0; i < len; i++) {
                thisSum = 0;
            for (int j = i; j < len; j++) {
                thisSum += arr[j];
                if ((thisSum > 0) && (thisSum < minPositiveSum)) {
                    minPositiveSum = thisSum;
                }
            }
        }return minPositiveSum;
    }


    /**
     * 思路：
     * 遍历所有数组乘积
     * 需注意：初始值设置为 1
     * @param arr
     * @return
     */
    public static int maxProduct(int[] arr){

        int maxProduct = 0;
        int thisProduct;
        for (int i = 0; i < arr.length; i++) {
                thisProduct = 1;

            for (int j = i; j < arr.length; j++) {
                thisProduct *= arr[j];
                if (thisProduct > maxProduct){
                    maxProduct = thisProduct;
                }
            }
        }
        return maxProduct;
    }


}
