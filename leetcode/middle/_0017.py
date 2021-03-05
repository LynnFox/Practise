class Solution:
    
    def letterCombinations(self, digits: str) -> List[str]:   
        if not digits:  # 判空!
            return list()

        # 建立映射表
        dic = {"2":"abc","3":"def","4":"ghi","5":"jkl","6":"mno","7":"pqrs","8":"tuv","9":"wxyz"}
        
        def DFS(index: int):  # index：数字下标
            if index == len(digits):  # 某次DFS结束，将结果加进结果列表
                combinations.append("".join(combination))
            else:
                digit = digits[index]
                for letter in dic[digit]:  # letter：数字digit对应的某个字母
                    combination.append(letter)
                    DFS(index+1)
                    combination.pop()  # 下一次循环之前把之前加进来的letter弹出去！！！
                
        combination = list()  # 记录某次DFS的结果
        combinations = list()  # 记录所有可能的结果
        DFS(0)
        
        return combinations
