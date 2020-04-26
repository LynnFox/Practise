//哈希计数
//O(n)+O(n)
class Solution {
    public static int majorityElement(int[] nums) {
        int res = nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num) == false) {
                map.put(num, 1);
            } else {
                int count = map.get(num);
                if (count == nums.length / 2) {
                    res = num;
                    break;
                }
                map.put(num, count + 1);
            }
        }
        return res;
    }
}

//排序
//O(nlogn)+O(logn)
//emmmm,从来没有写过这么短的解题代码
class Solution {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
