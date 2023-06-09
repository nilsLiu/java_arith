package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-31  23:00
 * @Version: 1.0
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给你二叉树的根节点 root ，返回其节点值的 锯齿形层序遍历 。
 * （即先从左往右，再从右往左进行下一层遍历，以此类推，层与层之间交替进行）
 */
public class subject103 {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        // 根节点为空，返回空列表
        if (root == null) {
            return Collections.emptyList();
        }
        //创建一个节点列表，用于保存当前层的节点
        List<TreeNode> cur = new ArrayList<>();
        //创建一个二维列表，用于保存每一层的节点值
        List<List<Integer>> ans = new ArrayList<>();
        //将根节点添加到当前层的节点列表中
        cur.add(root);
        boolean even = false;
        //当当前层的节点列表不为空时，继续循环
        while (!cur.isEmpty()) {
            //创建一个节点列表，用于保存下一层的节点
            List<TreeNode> nxt = new ArrayList<>();
            //创建一个整数列表，用于保存当前层的节点值
            List<Integer> vals = new ArrayList<>();

            //遍历当前层的所有节点
            for (TreeNode node : cur) {
                //将当前节点的值添加到当前层的节点值列表中
                vals.add(node.val);
                //如果当前节点有左子节点，将其添加到下一层的节点列表中
                if (node.left != null) nxt.add(node.left);
                //如果当前节点有右子节点，将其添加到下一层的节点列表中
                if (node.right != null) nxt.add(node.right);
            }
            //将当前层的节点列表更新为下一层的节点列表
            cur = nxt;
            even = !even;
            //将当前层的节点值列表添加到二维列表中
            if (!even) Collections.reverse(vals);
            ans.add(vals);
        }

        return ans;
    }
}
