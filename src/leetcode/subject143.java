package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-25  09:45
 * @Version: 1.0
 */

/**
 * 给定一个单链表 L 的头节点 head ，单链表 L 表示为：
 * L0 → L1 → … → Ln - 1 → Ln
 * <p>
 * 请将其重新排列后变为：
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * <p>
 * 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 输入：head = [1,2,3,4]
 * 输出：[1,4,2,3]
 */
public class subject143 {

    public void reorderList(ListNode head) {
        //找到原链表的中点
        ListNode mid = middleNode(head);
        
        //将原链表的右半端反转
        ListNode head2 = reverseList(mid);

        //将原链表的两端合并
        while (head2.next != null) {
            ListNode next1 = head.next;
            ListNode next2 = head2.next;

            head.next = head2;
            head2.next = next1;

            head = next1;
            head2 = next2;

        }

    }

    public ListNode middleNode(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while (l2 != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return l1;
    }

    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;

        while (cur != null) {
            // 存储后一节点的位置
            ListNode next = cur.next;
            // 反转操作，当前节点指向上一个节点
            cur.next = pre;
            //存储当前节点为下一翻转节点的位置
            pre = cur;
            //移动链表的头节点到存储的后一节点的位置
            cur = next;
        }
        return pre;

    }
}
