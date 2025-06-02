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
    public ListNode doubleIt(ListNode head) {
        if (head.val > 4) head = new ListNode(0, head);
        ListNode dummy = head;
        while (dummy != null) {
            int val = dummy.val * 2 % 10;
            dummy.val = dummy.next != null && dummy.next.val > 4 ? val + 1 : val;
            dummy = dummy.next;
        }
        return head;
    }
}