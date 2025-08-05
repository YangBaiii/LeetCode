# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumNumbers(self, root: Optional[TreeNode]) -> int:
        
        def sumTree(node, val):
            if not node:
                return val

            val = node.val + val * 10

            if not node.left and not node.right:
                return val
                
            left = sumTree(node.left, val)
            right = sumTree(node.right, val)

            return left + right
        
        return sumTree(root, 0)