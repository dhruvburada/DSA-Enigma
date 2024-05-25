class Solution {
    public int diagonalSum(int[][] mat) {
        int index=0;
        int sum=0;
        for(int i=0; i<mat.length;i++)
        {
            sum=sum+mat[index][index];
            index++;
        }

        index=0;
        for(int j=0;j<mat.length;j++)
        {
            if(mat.length-j-1 == index)
            {
                index++;
                continue;
            }
            sum=sum+mat[index][mat.length-j-1];
            index++;
        }

        return sum;
    }
}