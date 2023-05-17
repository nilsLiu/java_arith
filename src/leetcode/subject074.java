package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-17  15:35
 * @Version: 1.0
 */

/**
 * 编写一个高效的算法来判断 m x n 矩阵中，是否存在一个目标值。该矩阵具有如下特性：
 * <p>
 * 每行中的整数从左到右按升序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * <p>
 * 输入：matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * 输出：true
 */

public class subject074 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        System.out.println(searchMatrix(matrix, 2));
    }

    //使用两次二分法寻找target
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int length = matrix[0].length;

        if (length == 0) {
            return false;
        }
        // 找到合适的行
        int left = 0;
        int right = row - 1;
        while (left <= right) {
            int midRow = (left + right) / 2;
            //当目标数大于此行第一个数且小于最后一个数时确定该行为目标行
            if (target >= matrix[midRow][0] && target <= matrix[midRow][length - 1]) {
                int targetRow = midRow;
                int leftColum = 0;
                int rightColum = length;
                //在目标行进行二分，匹配target
                while (leftColum <= rightColum) {
                    int mid = (leftColum + rightColum) / 2;
                    if (matrix[targetRow][mid] < target) {
                        leftColum = mid + 1;
                    } else {
                        rightColum = mid - 1;
                    }
                }
                if (matrix[targetRow][leftColum] == target) {
                    return true;
                } else {
                    return false;
                }


            } else if (matrix[midRow][0] < target) {
                left = midRow + 1;
            } else {
                right = midRow - 1;
            }
        }


        return false;
    }
}
