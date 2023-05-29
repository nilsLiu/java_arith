package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-29  14:55
 * @Version: 1.0
 */

/**
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 */
public class subject104 {

    //递归
    public int maxDepth(TreeNode root) {
        // 如果根节点为 null，则二叉树深度为 0
        if (root == null) {
            return 0;
        }

        // 计算左子树的深度和右子树的深度
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);

        // 返回左子树深度和右子树深度的最大值加上 1，即为二叉树的最大深度
        return Math.max(left_depth, right_depth) + 1;
    }

}
