class Solution {
    public int[][] findContinuousSequence(int target) {

        int i = 1;//窗口左边界
        int j = 1;//窗口右边界
        int sum = 0;//窗口内所有值的和
        ArrayList<int[]> res = new ArrayList<>();
        while (i <= target / 2) {

            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] tmp = new int[j - i];

                for (int u = i; u < j; u++) {
                    tmp[u - i] = u;
                }
                res.add(tmp);

                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
