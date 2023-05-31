package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-30  14:03
 * @Version: 1.0
 */

/**
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，
 * 满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）
 */
public class subject236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //如果当前节点是p，q 或者 当前节点是空 返回当前节点
        if (root == null || root == p || root == q) {
            return root;
        }
        //查询左树
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        //查询右树
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //左右子树都查询到，此时root就是最近公共祖先
        if (left != null && right != null) {
            return root;
        }
        // 左树找到的情况，返回递归左树的结果
        if (left != null) {
            return left;
        } else {
            // 右树找到的情况，返回递归右树的结果
            return right;
        }
    }
}
