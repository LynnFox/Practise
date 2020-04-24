//不考虑大数的情况
//1.计算n位数的范围time(可以调用pow函数计算)
//2.将1到time的所有数塞进数组
//3.返回
class Solution {
    public int[] printNumbers(int n) {
        int  time = 1;
        for(int i=0; i<n; i++){
            time *= 10;
        }
        time--;
        int []res = new int[time];
        for(int i=0; i<time; i++){
            res[i] = i+1;
        }
        return res;
    }
}

