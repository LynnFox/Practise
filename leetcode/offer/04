//思路：从右上角开始查找，目标值大，向下找；目标值小，向右找
class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int n = matrix.length, m = matrix[0].length;
        int row = 0, col = m-1;

        while(row<n && col>=0){
            int num = matrix[row][col];
            if(num == target){
                return true;
            } else if(num > target){
                col--;
            } else{
                row++;
            }
        }
        return false;
    }
}
