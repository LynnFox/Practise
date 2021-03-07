'''
idea1：DFS
解法同【100.相同的树】十！分！类！似！
空树：一定是对称二叉树；
非空树：判断左右子树是不是对称，【100.相同的树】是左-左、右-右比较，这个题是左-右、右-左比较，其余全部一样！！！
'''
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if root is None:  # 空树否
            return True
        
        def isContrayTree(p: TreeNode, q: TreeNode) -> bool:
            if p is None and q is None:
                return True
            elif p is None or q is None:
                return False
            elif  p.val == q.val:
                return isContrayTree(p.left, q.right) and isContrayTree(p.right, q.left)  #左-右、右-左！！！
            return False
        
        return isContrayTree(root.left, root.right)  # 非空树
      
'''
idea2：BFS
同【100.相同的树】BFS解法
看代码的注释
'''
class Solution:
    def isSymmetric(self, root: TreeNode) -> bool:
        if root is None or (root.left is None and root.right is None):  # 空树或者一个结点
            return True
        
        if (root.left is not None and root.right is not None):  # 左右均不为空
            queue1 = collections.deque([root.left])            
            queue2 = collections.deque([root.right])
            
            while queue1 and queue2:
                node1 = queue1.popleft()
                node2 = queue2.popleft()
            
            	# 比较值
                if node1.val != node2.val:
                    return False
                
                # 比较子结点结构
                left1, right1 = node1.left, node1.right
                left2, right2 = node2.left, node2.right
                
                # 异或：同0异1 同False异Ture
                if ((left1 is None) ^ (right2 is None)) or ((right1 is None) ^ (left2 is None)):  # 左-右，右-左
                    return False
                if left1:
                    queue1.append(left1)
                if right1:
                	queue1.append(right1)
                if right2:  # 先加入右节点
                    queue2.append(right2)
                if left2:   # 再加入左节点
                    queue2.append(left2)            
            return not queue1 and not queue2   
        return False  # 左右一个为空，一个不为空
