package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-29  15:34
 * @Version: 1.0
 */

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class subject101 {

    public boolean isSymmetric(TreeNode root) {
        //判断是否对称，即值考虑根节点左右的树对称即可
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode p, TreeNode q) {
        //1. 都为null返回true
        if (p == null && q == null) {
            return true;
        }
        //2. 有一个是空，返回null
        if (p == null || q == null) {
            return false;
        }
        //3. 值不相同，返回null
        if (p.val != q.val) {
            return false;
        } else {
            //判断是否对称
            return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
        }

    }
}
