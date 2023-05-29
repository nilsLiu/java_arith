package leetcode;

/**
 * 给定一个已排序的链表的头 head ，
 * 删除所有重复的元素，使每个元素只出现一次 。
 * 返回 已排序的链表 。
 * <p>
 * 输入：head = [1,1,2]
 * 输出：[1,2]
 */
public class subject083 {


    public static ListNode deleteDuplicates(ListNode head) {

        // 使用指针cur指向链表头节点
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            //如果当前 cur 与 cur.next对应的元素相同，
            // 那么我们就将 cur.nex 从链表中移除；
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
                //  否则说明链表中已经不存在其它与 cur 对应的元素相同的节点，
                //  因此可以将 cur 指向 cur.next。
            } else {
                cur = cur.next;
            }
        }

        return head;
    }
}
