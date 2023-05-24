package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-24  19:35
 * @Version: 1.0
 */

/**
 * 给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
 * k 是一个正整数，它的值小于或等于链表的长度。
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 * <p>
 * 输入：head = [1,2,3,4,5], k = 2
 * 输出：[2,1,4,3,5]
 */
public class subject025 {

    public ListNode reverseKGroup(ListNode head, int k) {
        //创建一个虚拟节点l1，并指向head
        ListNode l1 = new ListNode(-1);
        l1.next = head;
        //l2指向l1
        ListNode l2 = l1;

        //计算链表长度
        int len = 0;
        while (head != null) {
            len++;
            head = head.next;
        }
        //当链表长度大于等于k时，进行反转操作
        while (len >= k) {
            //反转一次，链表长度减去k
            len -= k;
            // 定义一个前驱节点pre和当前节点curr，并将curr指向l2的下一个节点
            ListNode pre = null;
            ListNode curr = l2.next;
            for (int i = 0; i < k; i++) {
                // 定义一个后继节点next，并将curr的next指向pre
                ListNode next = curr.next;
                curr.next = pre;
                pre = curr;
                curr = next;
            }
            // 定义一个节点nxt，并将其指向l2的下一个节点
            ListNode nxt = l2.next;
            // 将l2的下一个节点的next指向curr，将l2的next指向pre
            l2.next.next = curr;
            l2.next = pre;
            // 将l2更新到nxt位置
            l2 = nxt;
        }
        return l1.next;
    }
}
