package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-29  14:22
 * @Version: 1.0
 */

/**
 * 给定一个已排序的链表的头 head ， 删除原始链表中所有重复数字的节点，只留下不同的数字 。
 * 返回 已排序的链表 。
 * <p>
 * <p>
 * 输入：head = [1,2,3,3,4,4,5]
 * 输出：[1,2,5]
 */
public class subject082 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        ListNode l1 = dummyNode;

        // 循环遍历链表，直到 l1 指向链表末尾或倒数第二个节点
        while (l1.next != null && l1.next.next != null) {


            int val = l1.next.val;

            // 如果下一个节点的值与当前节点的值相同，说明当前节点是重复节点
            if (l1.next.next.val == val) {

                // 删除后面所有值相同的节点，直到下一个节点的值与当前节点的值不同为止
                while (l1.next != null && l1.next.val == val) {
                    l1.next = l1.next.next;
                }

                // 如果下一个节点的值与当前节点的值不同，则将指针向前移动一个节点
            } else {
                l1 = l1.next;
            }
        }
        return dummyNode.next;
    }
}
