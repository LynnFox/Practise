'''
idea1：DFS

1. 判断两个对应节点是否【都为空】，是则返回True；
2. 判断两个对应节点是否【只有一个为空】，是则返回False；
3. 以上两个条件都不满足，那么这两个节点都是非空，判断【值是否相同】，是则分别对两个节点的左孩子和右孩子执行步骤1、2、3，并返回判断结果;
4. 以上三个条件都不满足，那么这两个非空节点的值不同，返回False。
5. 函数结束。
'''

class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        if p is None and q is None:
            return True
        elif p is None or q is None:
            return False
        elif  p.val == q.val:
            return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)
       	return False
