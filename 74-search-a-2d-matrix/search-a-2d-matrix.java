class Solution {
    public static boolean binarySearch(int[] matrix,int target)
    {
        int low=0;
        int high=matrix.length;
        int mid;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(matrix[mid] == target)
            {
                return true;
            }
            else if (matrix[mid]<target)
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }

        return false;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean result = false;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0] <=target && matrix[i][matrix[i].length-1] >=target)
            {
                result = binarySearch(matrix[i],target);
                break;
            }
        }
    return result;

    }
}