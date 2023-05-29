package leetcode;

/**
 * TODO
 *
 * @Author liuch
 * @Date 2023/5/29 23:42
 */

/**
 * 给你一个二叉树的根节点 root ，判断其是否是一个有效的二叉搜索树。
 * <p>
 * 有效 二叉搜索树定义如下：
 * 节点的左子树只包含 小于 当前节点的数。
 * 节点的右子树只包含 大于 当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 */
public class subject098 {
    public boolean isValidBST(TreeNode root) {
        while (root != null) {
            if ((root.left.val < root.val || root.left == null)
                    && (root.right.val > root.val || root.right == null)){
                return true;
            }
            else {
                return isValidBST(root.left) ^ isValidBST(root.right);
            }
        }


        return false;
    }
}
