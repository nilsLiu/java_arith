package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-31  23:44
 * @Version: 1.0
 */

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个二叉树的 根节点 root，请找出该二叉树的 最底层 最左边 节点的值。
 * <p>
 * 假设二叉树中至少有一个节点。
 */
public class subject513 {
    public int findBottomLeftValue(TreeNode root) {
        //创建队列
        Queue<TreeNode> deque = new ArrayDeque<>();
        //将头节点放入队列
        deque.add(root);
        TreeNode node = deque.poll().left;

        while (!deque.isEmpty()) {
            node = deque.poll().left;

            //如果当前节点有右子节点，将其添加到队列中
            if (node.right != null) deque.add(node.right);
            //如果当前节点有左子节点，将其添加到队列中
            if (node.left != null) deque.add(node.left);

        }
        return node.val;
    }
}
