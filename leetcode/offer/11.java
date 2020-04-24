//方案一：暴力+O(n)+O(1)
class Solution {
    public int minArray(int[] numbers) {
        if(numbers.length == 1)
            return numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i-1]>numbers[i]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
}

//方案二：二分+O(logn)+O(1)
class Solution {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        if (len == 1 || numbers[0] < numbers[len - 1])
            return numbers[0];

        int left = 0, right = len-1;
        while(left<right){
            int mid = (left + right) / 2;
            if(numbers[left] > numbers[mid]){
                right = mid;
            } else if(numbers[mid] > numbers[right]){
                left = mid+1;
            } else{
                right--;
            }
        }

        return numbers[left];
    }
}
