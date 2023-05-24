package leetcode;

/**
 * @BelongsProject: java_arith
 * @BelongsPackage: leetcode
 * @Author: hai
 * @CreateTime: 2023-05-24  09:20
 * @Version: 1.0
 */

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * <p>
 * 输入：head = [1,2,3,4,5]
 * 输出：[5,4,3,2,1]
 */
public class subject206 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.val = 1;
        listNode.next = new ListNode(2);
        System.out.println(reverseList(listNode));
    }
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;

        while (cur.next != null){
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


class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

