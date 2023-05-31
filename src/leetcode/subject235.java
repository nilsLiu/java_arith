package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-31  22:05
 * @Version: 1.0
 */

/**
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 */
public class subject235 {

    //若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值；
    //若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值；
    //它的左、右子树也分别为二叉排序树
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int x = root.val;
        // p q 都在左子树情况
        if (p.val < x && q.val < x) {
            return lowestCommonAncestor(root.left, p, q);
        }
        // p q 都在右子树情况
        if (p.val > x && q.val > x) {
            return lowestCommonAncestor(root.right, p, q);
        }
        // 其他情况：p q 分别在左右两侧 ； p是当前节点 ； q是当前节点
        // 返回当前节点
        else return root;

    }
}
