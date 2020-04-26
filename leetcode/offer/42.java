//贪心
//据说这是个贪心，但是菜鸡如我，感觉跟动规一样的
class Solution {
    public int maxSubArray(int[] nums) {
        int tempSum = 0;
        int res = nums[0];
        for(int num : nums){
            tempSum = (tempSum <= 0 ? 0 : tempSum)+num;
            res = res > tempSum ? res : tempSum;
        }
        return  res;
    }
}

//动态规划
class Solution {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        for(int i = 1; i < nums.length; i++){
            nums[i] +=  nums[i-1] > 0 ? nums[i-1] : 0;
            res = res > nums[i] ? res : nums[i];
        }
        return res;
    }
}


