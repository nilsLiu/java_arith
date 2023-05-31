package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-31  22:27
 * @Version: 1.0
 */

import java.util.*;

/**
 * 给你二叉树的根节点 root ，
 * 返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 */
public class subject102 {

    public List<List<Integer>> levelOrder(TreeNode root) {
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
            //将当前层的节点值列表添加到二维列表中
            ans.add(vals);
        }

        return ans;
    }

    //队列写法

    /**
     * 这段代码同样实现了二叉树的层序遍历，使用了一个队列deque和一个二维列表ans。
     * 首先将根节点添加到deque中，然后循环遍历每一层的节点。
     * 在每一层的循环中，首先获取当前队列的大小size，然后遍历这一层的所有节点，将节点的值添加到vals中，并将其左右子节点添加到队列中。
     * 遍历完当前层的所有节点后，将vals添加到ans中。最终返回保存所有层节点值的ans。
     *
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrderQue(TreeNode root) {
        // 根节点为空，返回空列表
        if (root == null) {
            return Collections.emptyList();
        }
        List<List<Integer>> ans = new ArrayList<>();
        //创建一个队列，用于保存每一层的节点
        Queue<TreeNode> deque = new ArrayDeque<>();
        deque.add(root);
        //当队列不为空时，继续循环
        while (!deque.isEmpty()) {
            int size = deque.size();
            //创建一个整数列表，用于保存当前层的节点值
            List<Integer> vals = new ArrayList<>();
            //遍历当前层的所有节点
            while (size-- > 0) {
                //从队列中取出一个节点
                TreeNode node = deque.poll();
                //将当前节点的值添加到当前层的节点值列表中
                vals.add(node.val);
                //如果当前节点有左子节点，将其添加到队列中
                if (node.left != null) deque.add(node.left);
                //如果当前节点有右子节点，将其添加到队列中
                if (node.right != null) deque.add(node.right);
            }
            ans.add(vals);

        }
        return ans;
    }
}



