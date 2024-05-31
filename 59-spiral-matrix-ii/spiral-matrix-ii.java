class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] result = new int[n][n];
        
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int dir=0;
        int count=1;
        while(left<=right && top <=bottom)
        {
            if(dir ==0)
            {
                for(int i=left;i<=right;i++)
                {
                    result[top][i] = count;
                    count++;
                }
                    top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=bottom;i++)
                {
                    result[i][right]=count;
                    count++;
                }
                    right--;
            }

            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    result[bottom][i] = count;
                    count++;
                }
                    bottom--;
            }
            else
            {
                for(int i=bottom;i>=top;i--)
                {
                    result[i][left]=count;
                    count++;
                }
                    left++;
            }

            dir = (dir+1)%4;
        }

        return result;

    }
}