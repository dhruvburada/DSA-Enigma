class Solution {
    public int diagonalSum(int[][] mat) {
        int index=0;
        int sum=0;
        for(int i=0; i<mat.length;i++)
        {
            sum=sum+mat[index][index];
            if(mat.length-i-1 == index)
            {
                index++;
                continue;
            }
            sum=sum+mat[index][mat.length-i-1];
            index++;
        }

        return sum;
    }
}