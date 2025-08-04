# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False

        def dfs(target, node):
            if not node or node.val > target:
                return False
            elif node.val == target:
                return True
            
            newTarget = target - node.val
            if newTarget == 0:
                return True

            return dfs(newTarget, node.left) or dfs(newTarget, node.right)
        
        return dfs(targetSum, root)