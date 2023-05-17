package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-17  16:50
 * @Version: 1.0
 */

/**
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */
public class subject100 {

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        System.out.println(isSameTree(treeNode1, treeNode2));
    }

    //深度优先遍历
    public static boolean isSameTree(TreeNode p, TreeNode q) {
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
            // 若相同，再分别判断两个二叉树的左子树是否相同以及右子树是否相同
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }

    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


