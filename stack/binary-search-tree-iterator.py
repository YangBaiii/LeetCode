# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class BSTIterator:

    def __init__(self, root):
        self.stack = []
        self.curr = root

    def next(self) -> int:
        while self.curr:
            self.stack.append(self.curr)
            self.curr = self.curr.left
        node = self.stack.pop()
        self.curr = node.right
        return node.val

    def hasNext(self) -> bool:
        return self.curr is not None or len(self.stack) > 0

# Your BSTIterator object will be instantiated and called as such:
# obj = BSTIterator(root)
# param_1 = obj.next()
# param_2 = obj.hasNext()