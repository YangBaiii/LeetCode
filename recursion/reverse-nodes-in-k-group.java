/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = 0;
        for (ListNode node = head; node != null; node = node.next) n++;

        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;

        while (n >= k) {
            ListNode cur = prev.next;
            for (int i = 1; i < k; i++) {
                ListNode next = cur.next.next;
                cur.next.next = prev.next;
                prev.next = cur.next;
                cur.next = next;
            }
            prev = cur;
            n -= k;
        }

        return dummy.next;
    }
}
