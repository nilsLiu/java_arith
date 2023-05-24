package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-24  20:19
 * @Version: 1.0
 */

/**
 * 给你单链表的头结点 head ，请你找出并返回链表的中间结点。
 * <p>
 * 如果有两个中间结点，则返回第二个中间结点。
 */
public class subject876 {
    /**
     * 朴素解法：这道题最朴素的做法是，先遍历一次，计算链表的长度，
     * 进而计算链表中间结点的下标（注意偶数结点的时候，得到的是中间的第二个结点）
     * ，然后再遍历一次，来到所要求结点的位置。
     *
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode l1 = head;

        int count = 0;
        while (l1 != null) {
            count++;
            l1 = l1.next;
        }
        for (int i = 0; i < count / 2; i++) {
            head = head.next;
        }
        return head;
    }

    /**
     * 快慢指针：
     * 使用两个指针变量，刚开始都位于链表的第 1 个结点，
     * 一个永远一次只走 1 步，一个永远一次只走 2 步，一个在前，一个在后，同时走。
     * 这样当快指针走完的时候，慢指针就来到了链表的中间位置。
     *
     * @param head
     * @return
     */
    public ListNode middleNode2(ListNode head) {
        ListNode l1 = head;
        ListNode l2 = head;
        while (l2 != null && l2.next != null) {
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return l1;
    }
}
