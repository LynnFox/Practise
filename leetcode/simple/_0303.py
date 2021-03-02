# idea1：前缀和

class NumArray:
    def __init__(self, nums: List[int]):
        self.preSums = [0]

        for num in nums:
            self.preSums.append(self.preSums[-1] + num) 

    def sumRange(self, i: int, j: int) -> int:
        return self.preSums[j+1] - self.preSums[i]


# idea2：分块

'''
将数组【分块加和】，这里设置【块】大小block_size = 100
block_sum[i]存储nums数组[100i, 100(i+1))的加和
在查询区间[i,j]的部分和时，将区间[i,j]分成三部分来计算：[i,u), [u,v), [v,j)，其中u = min()，i <= u <= j，v = max()，i <= v <= j

求和公式：ans = sum(nums[i], nums[u]) 
	           + sum(block_sum[u/100], block_sum[v/100]) 
	           + sum(nums[v], nums[j+1])
'''
# idea出处：https://leetcode-cn.com/problems/range-sum-query-immutable/solution/ni-yong-yuan-ke-yi-xiang-xin-fen-kuai-su-ugou/

class NumArray:

    def __init__(self, nums: List[int]):
        self.nums = nums
        self.block_size = 100
        self.block_sum = list()

        i = 0
        while i + self.block_size <= len(self.nums):
            self.block_sum.append(sum(self.nums[i:i+self.block_size]))
            i += self.block_size
        
    def sumRange(self, i: int, j: int) -> int:
        k = i
        ans = 0
        while k <= j:
            if k % self.block_size == 0 and k + self.block_size - 1 <= j:
                ans += self.block_sum[k // self.block_size]
                k += self.block_size
            else:
                ans += self.nums[k]
                k += 1
        return ans
