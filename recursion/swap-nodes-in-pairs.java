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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        dummy.next = head;
    
        while (head != null && head.next != null) {
            ListNode cur = head;
            ListNode next = head.next;
            cur.next = next.next;
            next.next = cur;
            prev.next = next;

            prev = cur;
            head = head.next;
        }
        return dummy.next; 
    }
}