'''
[Solution 1]
  利用异或运算。
  异或规则：(1) a ^ a = 0  (2) a ^ 0 = a (3) a ^ b = b ^ a
'''
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        length = len(nums)
        res = 0
        for i in range(0, length):
            res = nums[i] ^ res

        return res
 
'''
[Solution 2]
  利用set去重的性质。
'''

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        return 2 * sum(set(nums)) - sum(nums)

'''
[Solution 3]
  1.排序
  2.比较i，i+1位置的元素，不相同则返回i位置元素. (i = 0, 2, 4, ......）
'''

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()

        length = len(nums)

        for i in range(0, length-1, 2):
            if nums[i] != nums[i + 1]:
                return nums[i]

        return nums[-1]
