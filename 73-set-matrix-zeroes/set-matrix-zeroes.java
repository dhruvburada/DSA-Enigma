class Solution {
   
    public void setZeroes(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;        
        int col0 = 1;

        //using first row and first col as markers
        //matrix[0][..]=0
        //matrix[..][0]=0

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(matrix[i][j] == 0)
                {
                    if(j!=0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                    }
                    else
                    {
                        col0=0;
                    }
                }

            }
        }

        //mark zeros excluding the rows we are using as hash

        for (int i=1;i<n;i++)
        {
            for(int j=1;j<m;j++)
            {
                if(matrix[0][j] == 0 || matrix[i][0]==0)
                {
                    matrix[i][j] =0;
                }
            }
        }

        //mark the first row if the first element is zero

        if(matrix[0][0] == 0)
        {
            for(int j=0;j<m;j++)
            {
                matrix[0][j] =0;
            }
        }

        //mark the first col if col0 =0

        if(col0 == 0)
        {
            for(int i=0;i<n;i++)
            {
                matrix[i][0] = 0;
            }
        }

        
    }
}