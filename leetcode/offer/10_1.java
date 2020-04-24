//披着递归外衣的递推
class Solution {
    
    public int fib(int n) {
        int[] f = new int[n + 2];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = (f[i - 1] + f[i - 2]) % 1000000007;
        }
        return f[n] % 1000000007;
    }
}
