class Solution {
    public static int[] spiralOrder(int[][] matrix) {
        //预判数组是否为空
        if(matrix.length==0){
            return new int[0];
        }
        
        //初始化行首，行尾，列首，列尾
        int row_begin = 0;
        int row_end = matrix.length - 1;
        int col_begin = 0;
        int col_end = matrix[0].length - 1;
        
        //定义返回数组
        int limit = matrix.length * matrix[0].length;
        int[] res = new int[limit];
      
        //对于奇行奇列的二维数组，最后只剩中间的一个元素，将该元素放到res[]的最后
        if ((row_end + 1) % 2 == 1 && (col_end + 1) % 2 == 1) {
            res[limit - 1] = matrix[(row_end + 1) / 2][(col_end + 1) / 2];
        }

        int count = -1;
        while (row_begin <= row_end && col_begin <= col_end) {
                    
            int i = row_begin;//上边
            int j = col_begin;
            for (; j <= col_end - 1 && count < limit - 1; j++) {
                res[++count] = matrix[i][j];

            }

            i = row_begin;
            j = col_end;//右边
            for (; i <= row_end - 1 && count < limit - 1; i++) {
                res[++count] = matrix[i][j];
            }

            i = row_end;//下边
            j = col_end;
            for (; j >= col_begin + 1 && count < limit - 1; j--) {
                res[++count] = matrix[i][j];
            }

            i = row_end;
            j = col_begin;//左边
            for (; i >= row_begin + 1 && count < limit - 1; i--) {
                res[++count] = matrix[i][j];
            }

            //缩小范围
            row_begin++;
            row_end--;
            col_begin++;
            col_end--;
        }

        return res;
    }
}
