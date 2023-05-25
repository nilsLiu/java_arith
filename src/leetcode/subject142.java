package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-25  09:12
 * @Version: 1.0
 */


import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个链表的头节点  head ，返回链表开始入环的第一个节点。
 * 如果链表无环，则返回 null。
 *
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 如果 pos 是 -1，则在该链表中没有环。
 * 注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 *
 * 不允许修改 链表。
 */
public class subject142 {

    public ListNode detectCycle(ListNode head) {
        Set<ListNode> numsSets = new HashSet<>();

        while (head != null && head.next != null) {
            if (numsSets.contains(head)) {
                return head;
            }
            numsSets.add(head);
            head = head.next;
        }


        return null;
    }

    public ListNode detectCycle2(ListNode head){
        if (head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null){
            slow = slow.next;
            if (fast.next != null){
                fast = fast.next.next;
            }else {
                return null;
            }
            if (slow == fast){
                ListNode l1 = head;
                while (l1 != slow){
                    l1 = l1.next;
                    slow = slow.next;
                }
                return l1;
            }
        }
        return null;
    }
}
