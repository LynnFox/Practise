class Solution:
    def findRepeatNumber(self, nums: List[int]) -> int:
        dic = dict()
        for item in nums:
            if dic.get(item):
                return item
            else:
                dic[item] = 1

                
class Solution:
    def findRepeatNumber(self, nums: List[int]) -> int:
        nums.sort()
        for i in range(len(nums)):
            if nums[i] == nums[i+1]:
                return nums[i]
              
class Solution:
    def findRepeatNumber(self, nums: List[int]) -> int:
        i = 0
        while i < len(nums):
            if i == nums[i]:
                i += 1
                continue

            if nums[nums[i]] == nums[i]:
                return nums[i]

            nums[nums[i]], nums[i] = nums[i], nums[nums[i]]
        return -1
