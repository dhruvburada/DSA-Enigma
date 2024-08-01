class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid;
        int min=Integer.MAX_VALUE;
        while(low<=high)
        {
            mid=(low+high)/2;

            min = Math.min(nums[mid],min);
            //If left part of array is sorted
            if(nums[low]<=nums[mid])
            {
                min = Math.min(min,nums[low]);
                low=mid+1;
            }
            else
            {
                min=Math.min(nums[mid], min);
                high=mid-1;
            }
        }
        return min;
    }
}