//方案一：哈希计数
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

//方案二：排序
//O(nlogn)+O(logn)
//emmmm,从来没有写过这么短的解题代码
class Solution {
    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
//方案三：摩尔计数法
//O(n)+O(1)
class Solution {
    public static int majorityElement(int[] nums) {
        int res = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            count += (res == num) ? 1 : -1;
        }
        return res;
    }
}
