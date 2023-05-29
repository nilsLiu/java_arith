package leetcode;

/**
 * TODO
 *
 * @Author liuch
 * @Date 2023/5/25 23:02
 */

/**
 * 有一个单链表的 head，我们想删除它其中的一个节点 node。
 * <p>
 * 给你一个需要删除的节点 node 。你将 无法访问 第一个节点  head。
 * <p>
 * 链表的所有值都是 唯一的，并且保证给定的节点 node 不是链表中的最后一个节点。
 * <p>
 * 删除给定的节点。注意，删除节点并不是指从内存中删除它。这里的意思是：
 * 给定节点的值不应该存在于链表中。
 * 链表中的节点数应该减少 1。
 * node 前面的所有值顺序相同。
 * node 后面的所有值顺序相同。
 */
public class subject237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
