class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int m = matrix.length;
        int n = matrix[0].length;
        int high = (m*n)-1;
        int mid;

        while(low<=high)
        {
            mid = (low+high)/2;
            int row = mid / n;
            int col = mid % n;

            if(matrix[row][col] == target)
            {
                return true;
            }
            else if(matrix[row][col] > target)
            {
                high = mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return false;
    }
}