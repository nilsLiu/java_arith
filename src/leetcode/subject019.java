package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-29  14:03
 * @Version: 1.0
 */

/**
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 * <p>
 * 输入：head = [1,2,3,4,5], n = 2
 * 输出：[1,2,3,5]
 */
public class subject019 {

    //当输出链表可能为空时，创建虚拟头节点操作链表
    public ListNode removeNthFromEnd(ListNode head, int n) {

        //创建虚拟头节点，指向链表头
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;

        //创建两个指针，都指向虚拟头节点
        ListNode l1 = dummyNode;
        ListNode l2 = dummyNode;

        //l2向右移n个位置
        for (int i = 0; i < n; i++) {
            l2 = l2.next;
        }
        //l1,l2同时右移，知道l2移到链表末尾
        //此时l1，l2相距n，即l1指向要删除节点的前一位
        while (l2.next != null) {
            l1 = l1.next;
            l2 = l2.next;
        }

        //删除l1后的节点
        l1.next = l1.next.next;
        //返回表头
        return dummyNode.next;

    }
}
