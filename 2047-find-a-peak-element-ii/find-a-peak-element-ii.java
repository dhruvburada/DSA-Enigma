class Solution {

    public static int maxIndex(int[][] mat,int col)
    {
        int maxValue =-1;
        int maxIndex=0;
        for(int i=0;i<mat.length;i++)
        {
            if(mat[i][col] > maxValue)
            {
                maxValue = mat[i][col];
                maxIndex = i;
            }
        }

        return maxIndex;
    }
    public int[] findPeakGrid(int[][] mat) {
        int low =0;
        int high = mat[0].length-1;

        while(low<=high)
        {
            int col = (low+high)/2;
            int row = maxIndex(mat,col);

            int left = col-1 >=0 ? mat[row][col-1] : -1;
            int right = col+1 <= high ? mat[row][col+1] : -1;

            if(mat[row][col] > left && mat[row][col] > right)
            {
                return new int[] {row,col};
            }
            else if(mat[row][col] < left)
            {
                high = col-1;
            }  
            else
            {
                low = col+1;
            }
        }

        return new int[] {-1,-1};
    }
}