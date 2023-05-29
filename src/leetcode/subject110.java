package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-29  15:53
 * @Version: 1.0
 */

/**
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 * <p>
 * 本题中，一棵高度平衡二叉树定义为：
 * <p>
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
 */
public class subject110 {

    public boolean isBalanced(TreeNode root) {
        // 如果根节点为 null，则二叉树为平衡二叉树
        if (root == null) {
            return true;
        }
        // 如果根节点为 null，则二叉树为平衡二叉树
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) {
            return false;
        } else {
            // 如果左子树和右子树的深度差小于等于 1，则递归判断左子树和右子树是否为平衡二叉树
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int maxDepth(TreeNode root) {
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
