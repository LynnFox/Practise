//方法一：遍历数组
//时间复杂度：O(n)
//空间复杂度：O(1)
class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i)
                break;
            i++;
        }
        return i;
    }
}

//方法二：二分
//思路：以mid为分界点，mid处的元素如果等于mid，说明在mid的右边；mid处的元素如果不等于mid，说明在mid的左边
//时间复杂度：O(logn)
//空间复杂度：O(1)
class Solution {
    public int missingNumber(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
