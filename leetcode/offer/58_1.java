//正则+split+StringBuilder
//代码简单，但是耗时6ms
class Solution {
    public String reverseWords(String s) {
        if (s == null || s.length() == 0)
            return "";

        String[] st = s.trim().split("\\s+");
        StringBuilder builder = new StringBuilder();
        int len = st.length;
        for (int i = len - 1; i >= 0; i--) {
            builder.append(st[i] + " ");

        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}

//2ms
class Solution {
    public String reverseWords(String s) {
        if (s.length() == 0) return "";

        char[] st = s.toCharArray();
        StringBuilder res = new StringBuilder();

        for (int i = s.length() - 1, j = i; i >= 0 && j >= 0; ) {
            //越过空格
            while (j >= 0 && st[j] == ' ') {//循环后，j保存子串最后一个非空字符的位置
                j--;
            }

            if (j < 0)
                break;

            i = j;

            while (j >= 0 && st[j] != ' ') {//循环后，j保存子串第一个非空字符的下一个位置
                j--;
            }

            //i:结束的位置
            //j+1:开始的位置
            //i-j:子串长度
            res.append(st, j + 1, i - j).append(" ");
            i = j;
        }

        //如果字符串只包含' ',返回""
        return res.length() == 0 ? "" : res.substring(0, res.length() - 1);
    }      
}
