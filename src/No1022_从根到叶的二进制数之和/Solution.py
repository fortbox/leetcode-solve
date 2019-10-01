# Definition for a binary tree node.
class TreeNode:
    def __init__(self, x):
        self.val = x
        self.left = None
        self.right = None


class Solution:
    def sumRootToLeaf(self, root: TreeNode) -> int:
        return self.dfsSum(root, 0)

    def dfsSum(self, root: TreeNode, sum) -> int:
        if not root:
            return 0
        sum = (sum << 1) + root.val
        if root.left is None and root.right is None:
            return sum
        return self.dfsSum(root.left, sum) + self.dfsSum(root.right, sum)
