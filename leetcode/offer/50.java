//借用HashMap统计出现次数+O(n)+O(n)
class Solution {
    public char firstUniqChar(String s) {
        if (s == null || s.length() == 0)
            return ' ';

        char[] str = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (char ch : str) {
            if(!map.containsKey(ch)){
                map.put(ch, 1);
            } else{
                map.put(ch, map.get(ch) + 1);
            }
        }

        for(char ch : str){
            if(map.get(ch) == 1){
                return ch;
            }
        }

        return ' ';
    }
}
