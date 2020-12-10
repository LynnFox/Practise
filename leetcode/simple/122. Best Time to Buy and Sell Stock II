class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        money = 0
        length = len(prices)
        for i in range(1, length):
            money += (prices[i] - prices[i - 1]) if prices[i] > prices[i-1] else 0

        return money
