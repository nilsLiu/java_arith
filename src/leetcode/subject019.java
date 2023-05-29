package leetcode;

/**
 * TODO
 *
 * @Author liuch
 * @Date 2023/5/25 23:38
 */

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 */
public class subject019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 0;

        ListNode l0 = head;
        while (l0 != null) {
            count++;
            l0 = l0.next;
        }

        ListNode l1 = head;
        for (int i = 0; i < count - n; i++) {
            l1 = l1.next;
        }
        for (int i = 0; i < n - 1; i++) {
            l1 = l1.next.next;
        }


        return head;
    }
}
