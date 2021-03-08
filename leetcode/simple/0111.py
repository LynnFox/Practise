'''
idea1: DFS
'''
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: TreeNode) -> int:
        if root is None:  # 空树
            return 0
        if root.left is None and root.right is None:  # 一个节点
            return 1
        
        res = 0x3f3f3f3f
        if root.left:
            res = min(self.minDepth(root.left), res)
        if root.right:
            res = min(self.minDepth(root.right), res)
        
        return res + 1
      
      
'''
idea2: BFS
'''
      
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: TreeNode) -> int:
        if not root:
            return 0

        queue = collections.deque([(root, 1)])
        while queue:
            node, depth = queue.popleft()
            if not node.left and not node.right:
                return depth
            if node.left:
                queue.append((node.left, depth + 1))
            if node.right:
                queue.append((node.right, depth + 1))
        
        return 0
