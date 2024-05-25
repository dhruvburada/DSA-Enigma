class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int matrix[][] = new int[m][n];
        int count=0;
        for(int i =0;i<indices.length;i++)
        {
            int index = indices[i][0];
            for(int j = 0 ;j<matrix[0].length;j++)
            {
                matrix[index][j]++;
            }
        }
        
        for(int i =0;i<indices.length;i++)
        {
            int index = indices[i][1];
            for(int j = 0 ;j<matrix.length;j++)
            {
                matrix[j][index]++;
            }
        }
        
        for(int[] array : matrix)
        {
            for(int value : array)
            {
                if(value%2!=0)
                {
                    count++;
                }
            }
        }

        return count;
    }
}