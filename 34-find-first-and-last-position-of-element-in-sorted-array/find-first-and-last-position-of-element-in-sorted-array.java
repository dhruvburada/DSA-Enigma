class Solution {

    static int findFirst(int[] array,int target)
    {

        int low = 0;
        int high = array.length-1;
        int mid;
        int index=-1;
        while(low<=high)
        {
            mid = (low+high)/2;

            if(array[mid]==target)
            {
                index =  mid;
                high = mid-1;
            }
            else if(array[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return index;
    }
    static int findLast(int[] array,int target)
    {
        int low = 0;
        int high = array.length-1;
        int mid;
        int index=-1;
        while(low<=high)
        {
            mid = (low+high)/2;

            if(array[mid]==target)
            {
                index =  mid;
                low = mid+1;
            }
            else if(array[mid]>target)
            {
                high=mid-1;
            }
            else
            {
                low = mid+1;
            }
        }
        return index;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums,target);
        result[1] = findLast(nums,target);

        return result;
    }
}