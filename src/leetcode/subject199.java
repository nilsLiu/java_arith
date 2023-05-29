package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-29  16:06
 * @Version: 1.0
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树的 根节点 root，
 * 想象自己站在它的右侧，
 * 按照从顶部到底部的顺序，
 * 返回从右侧所能看到的节点值。
 */
public class subject199 {

    ArrayList<Integer> list = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        // 调用递归函数
        func(root, 0);
        return list;
    }

    /**
     * 递归函数，用于遍历二叉树每个节点。
     *
     * @param root  当前遍历到的节点
     * @param depth 当前节点的深度
     */
    private void func(TreeNode root, int depth) {
        // 如果当前节点为 null，直接返回
        if (root == null) {
            return;
        }
        // 如果当前深度等于列表的大小，则将当前节点的值加入列表中
        if (list.size() == depth) {
            list.add(root.val);
        }
        // 先递归遍历右子树
        func(root.right, depth + 1);
        // 右子数未能添加元素，就添加左边元素
        func(root.left, depth + 1);
    }


}
