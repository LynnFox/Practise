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

    
'''
idea2：BFS（参照官方题解）

1. 判断两个根节点，都为空，返回True；一空一不空，返回False；
2. 都不空，开始BFS：
   1. 准备工作：将节点p、q分别加入队列queue1、queue2
   2. 对比两个队列中的最左侧的节点node1、node2
      1. 对比值：值不同，返回False；
      2. 对比子节点的结构：结构不同，返回False；
      3. 子节点不为空，加入队列
      4. 两个队列均不为空，执行下一循环
   3. 两个队列同时为空，返回True，否则False。
ps: 千万注意 not 和 is None 的区别
'''

class Solution:
    def isSameTree(self, p: TreeNode, q: TreeNode) -> bool:
        if p is None and q is None:
            return True
        elif p is None or q is None:
            return False
        
        queue1 = collections.deque([p])
        queue2 = collections.deque([q])
		
        while queue1 and queue2:
            node1 = queue1.popleft()
            node2 = queue2.popleft()
            
            # 比较值
            if node1.val != node2.val:
                return False
            
            # 比较子节点结构
            left1, right1 = node1.left, node1.right
            left2, right2 = node2.left, node2.right
            
            # 异或：同0异1 同False异Ture
            if ((left1 is None) ^ (left2 is None)) or ((right1 is None) ^ (right2 is None)):
                return False

            if left1:
                queue1.append(left1)
            if right1:
                queue1.append(right1)
            if left2:
                queue2.append(left2)
            if right2:
                queue2.append(right2)

        return not queue1 and not queue2    
