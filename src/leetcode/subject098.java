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
        // 初始化左右边界为负无穷大和正无穷大。
        double left = -Double.POSITIVE_INFINITY;
        double right = Double.POSITIVE_INFINITY;
        // 调用 check 方法检查二叉树是否为二叉搜索树。
        return check(root, left, right);
    }

    /**
     * 该方法用于检查二叉搜索树是否满足每个节点的值都在给定的左右边界内。
     *
     * @param root  二叉搜索树的根节点
     * @param left  给定的左边界
     * @param right 给定的右边界
     * @return 如果二叉搜索树的每个节点都在给定的左右边界内，则返回 true；否则返回 false。
     */
    public boolean check(TreeNode root, double left, double right) {
        if (root == null) {
            // 如果当前节点为空，则返回 true，因为空节点符合要求。
            return true;
        }
        // 获取当前节点的值。
        int x = root.val;
        // 检查当前节点的值是否在给定的左右边界内，并递归检查左右子树的值是否符合要求。
        // 如果当前节点的值不在给定的左右边界内或左右子树的值不符合要求，则返回 false。
        return
                left < x && x < right && check(root.left, left, x) && check(root.right, x, right);
    }


    /**
     * 中序遍历
     * 中序遍历时，判断当前节点是否大于中序遍历的前一个节点，
     * 如果大于，说明满足 BST，继续遍历；否则直接返回 false。
     *
     * @param root
     * @return
     */
    public boolean isValidBST1(TreeNode root) {
        // 最小值初始化为中序序列的第一个节点值
        long pre = Long.MIN_VALUE;
        // 结束条件：如果root为null，返回true。
        if (root == null) {
            return true;
        }
        // 中序遍历：左根右
        //访问左子树
        if (!isValidBST1(root.left)) {
            return false;
        }
        // 访问当前节点：如果当前节点小于等于中序遍历的前一个节点，
        // 说明不满足BST，返回 false；否则继续遍历。
        if (root.val <= pre) {
            return false;
        }

        // 如果当前节点小于中序序列上一个值，证明符合条件，更新pre为当前值，继续判断下一个值，
        pre = root.val;
        //访问右子树
        return isValidBST1(root.right);
    }
}
