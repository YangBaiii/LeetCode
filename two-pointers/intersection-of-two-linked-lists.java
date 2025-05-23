/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0, len2 = 0;
        ListNode head1 = headA, head2 = headB;
        while (headA != null) {
            headA = headA.next;
            len1++;
        }
        while (headB != null) {
            headB = headB.next;
            len2++;
        }
        int n = 0;
        if (len1 > len2) {
            while (n < len1 - len2) {
                head1 = head1.next;
                n++;
            }
        } else {
            while (n < len2 - len1) {
                head2 = head2.next;
                n++;
            }
        }
        while (head1 != null) {
            if (head1 == head2) return head1;
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }
}