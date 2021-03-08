'''
idea1:DFS
'''

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxDepth(self, root: TreeNode) -> int:
        if root is None:
            return 0
        
        leftLen = self.maxDepth(root.left)
        rightLen = self.maxDepth(root.right)
        
        return max(leftLen , rightLen) + 1
