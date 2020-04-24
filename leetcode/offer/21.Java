//正向查找偶数，逆向查找奇数

class Solution {
    public int[] exchange(int[] nums) {
        
        int i = 0;//记录偶数的位置
        int j = nums.length-1;//记录奇数的位置
        
        while(i<j){
            
            if(nums[i]%2==0&&nums[j]%2!=0) {//找到一奇一偶，交换
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            
            if(nums[i]%2!=0)//若是奇数，元素留在原地，i向后寻找
                i++;
            
            if(nums[j]%2!=1)//若是偶数，元素留在原地，j向前寻找
                j--;
        }
        return nums;
    }
}
