package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-24  20:29
 * @Version: 1.0
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 给你一个链表的头节点 head ，判断链表中是否有环。
 * <p>
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。
 * 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
 * 注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
 * <p>
 * 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 */
public class subject141 {

    /**
     * 使用hashset存储ListNode
     * 当存在相同的ListNode时，则表示经过相同节点
     *
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> numsSets = new HashSet<>();

        while (head != null && head.next != null) {
            if (numsSets.contains(head)) {
                return true;
            }
            numsSets.add(head);
            head = head.next;
        }


        return false;
    }

    /**
     * 快慢指针
     * 定义两个指针，一快一慢。慢指针每次只移动一步，而快指针每次移动两步。
     * 如果在移动的过程中，快指针反过来追上慢指针，就说明该链表为环形链表。
     * 否则快指针将到达链表尾部，该链表不为环形链表。
     *
     * @param head
     * @return
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;

        }

        return true;
    }
}
