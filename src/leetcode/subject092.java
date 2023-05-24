package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-24  11:47
 * @Version: 1.0
 */

/**
 * 给你单链表的头指针 head 和两个整数 left 和 right ，其中 left <= right 。
 * 请你反转从位置 left 到位置 right 的链表节点，返回 反转后的链表 。
 * <p>
 * 输入：head = [1,2,3,4,5], left = 2, right = 4
 * 输出：[1,4,3,2,5]
 */
public class subject092 {
    /**
     * 思路：反转 left 到 right 部分以后，再拼接起来。
     *
     * @param head
     * @param left
     * @param right
     * @return
     */
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // 创建一个虚拟节点，并将其指向链表头节点
        ListNode l1 = new ListNode(-1);
        l1.next = head;
        // 创建一个指向左端点前一个节点的指针
        ListNode l2 = l1;

        // 创建一个指向左端点前一个节点的指针
        for (int i = 0; i < left - 1; i++) {
            l2 = l2.next;
        }
        // 创建指向左端点的指针 pre 和指向右端点之后一个节点的指针 curr，
        // 初始时 pre 和 curr 都为 null 和 left 节点
        ListNode pre = null;
        ListNode curr = l2.next;
        // 反转左右端点之间的链表节点
        for (int i = 0; i < right - left + 1; i++) {

            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        // 将反转后的左端点连接到右端点之后的节点
        l2.next.next = curr;
        // 将左端点前一个节点的 next 指向反转后的左端点
        l2.next = pre;
        // 返回虚拟节点的下一个节点，即反转后的链表头节点
        return l1.next;
    }


}
