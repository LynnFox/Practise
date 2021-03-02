# idea:前缀和
'''
参照Leetcode [303. 区域和检索 - 数组不可变] 的前缀和解法
对每一行元素求前缀和
查询时，累加每一行指定区间[col1, col2]的区间和
'''

class NumMatrix:

    def __init__(self, matrix: List[List[int]]):
        self.preSums = list()        

        for row in matrix:
            # 对每一行元素求前缀和
            preSum = [0]
            for col in row:
                preSum.append(preSum[-1] + col)
                
            self.preSums.append(preSum)

    def sumRegion(self, row1: int, col1: int, row2: int, col2: int) -> int:
        ans = 0
        for i in range(row1, row2+1):
            ans += self.preSums[i][col2+1] - self.preSums[i][col1]
        return ans
