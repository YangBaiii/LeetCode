# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        fast, slow = ListNode(0), ListNode(0)
        fast.next = head
        slow.next = head

        while fast and slow:
            fast = fast.next.next
            slow = slow.next

            if fast == slow:
                return True

        return False