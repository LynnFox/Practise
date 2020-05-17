//思路：
//1.准备两个数组，一个记录i位置之前的所有数的乘积，另一个记录i位置之后所有数的乘积
//2.两个数组对应位置相乘，最后得到的数组即为答案
//时间复杂度：O(n)
//空间复杂度：O(n)
class Solution {
    public int[] constructArr(int[] a) {
        if (a.length == 0)
            return new int[0];
        int len = a.length;
        int[] b = new int[len];
        int[] c = new int[len];
        int[] res = new int[len];
        b[0] = 1;
        for (int i = 1; i < len; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }
        c[len - 1] = 1;
        for (int i = len - 2; i >= 0; i--) {
            c[i] = c[i + 1] * a[i + 1];
        }

        for (int i = 0; i < len; i++) {
            res[i] = b[i] * c[i];
        }
        return res;
    }
}
