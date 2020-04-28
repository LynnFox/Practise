//直接遍历数组
//时间复杂度:O(n)
//空间复杂度:O(1)
class Solution {
    public int search(int[] nums, int target) {
        int count = 0;
        for(int num : nums){
            if(num == target)
                count++;
        }
        return count;
    }
}

//二分
