package chapter2;

public class test2_28 {

    public static void main(String[] args) {

        int[] a = {7, 2, 4, 5, 8, 4, 3, 4};
        System.out.println("和的最大值是 " + maxSum(a));
        System.out.println("差的最大值是 " + maxSub(a));
        System.out.println("乘积的最大值是 " + maxProduct(a));
        System.out.println("商的最大值是 " + maxQuotient(a));
    }

    /**
     * 取数组中的两个元素和的最大值
     * @param nums
     * @return
     */
    public static int maxSum(int[] nums){

        //冒泡排序法
        BubbleSort(nums);
        return nums[nums.length-2] + nums[nums.length - 1];
    }


    public static int maxSub(int[] nums){

        int low = 0;
        int high = nums.length - 1;
        int minus = nums[high] - nums[low];
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] < nums[low]){
                low = i;
            }
            if (nums[i] - nums[low] > minus){
                high = i;
                minus = nums[high] - nums[low];
            }
        }
        return minus;
    }

    public static int maxProduct(int[] nums){
        BubbleSort(nums);
        return (nums[nums.length - 1] * nums[nums.length - 2]);
    }


    public static int maxQuotient(int[] nums){
        int low = 0;
        int high = nums.length - 1;
        int quotient = nums[high] / nums[low];
        for (int i = 0; i < nums.length-1; i++) {

            if (nums[i] < nums[low]){
                low = i;
            }
            if (nums[i] / nums[low] > quotient){
                high = i;
                quotient = nums[high] / nums[low];
            }
        }
        return quotient;
    }

    private static void BubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length -  i - 1; j++)
            {
                if (nums[j] > nums[j + 1])
                {
                    int temp;
                    temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }


}
