class Solution {
   
    public void setZeroes(int[][] matrix) {
        
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        int[] markRow = new int[rowSize];
        int[] markCol = new int[colSize];

        for(int i = 0;i<rowSize;i++)
        {
            for(int j=0;j<colSize;j++)
            {
                if(matrix[i][j]==0)
                {
                    markRow[i] = 1;
                    markCol[j] =1;
                }
            }
        }

        for(int i = 0;i<rowSize;i++)
        {
            for(int j=0;j<colSize;j++)
            {
                if(markRow[i]==1 || markCol[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}