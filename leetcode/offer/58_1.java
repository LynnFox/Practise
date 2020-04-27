//正则+split+StringBuilder
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
