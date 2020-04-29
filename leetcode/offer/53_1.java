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
class Solution {
    public int search(int[] nums, int target) {
        //找到第一个目标的位置
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] >= target){
                j = mid - 1;
            } else{
                i = mid + 1;
            }
        }
        int left = i;

        //找到最后一个目标的位置
        j = nums.length - 1;
        while(i <= j){
            int mid = (i + j) / 2;
            if(nums[mid] <= target){
                i = mid + 1;
            } else{
                j = mid - 1;
            }
        }
        int right = j;

        return right - (left - 1);
    }
}
