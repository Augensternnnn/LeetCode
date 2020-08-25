package List;

/**
 * 剑指offer 22.链表中倒数第K个节点
 * https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/submissions/
 */
public class _22_GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head, latter = head;
        for (int i = 0; i < k; i++)
            former = former.next;
        while (former != null){
            former = former.next;
            latter = latter.next;
        }
        return latter;
    }

    public ListNode getKthFromEnd_1(ListNode head, int k) {
        ListNode node = head;
        int cum = 0;
        while (node != null){
            node = node.next;
            cum++;
        }
        for (int i = 0; i <= cum - k - 1; i++) {
            head = head.next;
        }
        return head;
    }
}
