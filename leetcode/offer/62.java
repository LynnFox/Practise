//思路一：模拟(会超时)
//时间复杂度：O(nm)
//空间复杂度：O(n)
class Solution {
    public int lastRemaining(int n, int m) {
        boolean[] flag = new boolean[n];
        for(int i = 0; i < n; i++){
            flag[i] = true;
        }

        int count = 0;
        int i = -1;
        int res = 0;
        while(count < n){
            int j = 0;
            do{
                i = (i + 1) % n;
                if(flag[i]){
                    j++;
                }
           }while(j < m);
            res = i;
            flag[i] = false;
            count++;
        }
        return res;
    }
}

//思路二：递推（神奇o((>ω< ))o）
class Solution {
    public int lastRemaining(int n, int m) {
        int pos = 0;
        for (int i = 2; i <= n; i++) {
            pos = (pos + m) % i;
        }
        return pos;
    }
}
