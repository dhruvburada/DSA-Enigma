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
                //If the left part is sorted then the min element will be low itself
                min = Math.min(min,nums[low]);
                //look for min in unsorted part
                low=mid+1;
            }
            //If the right part is sorted then the mid will be min automatically
            else
            {
                min=Math.min(nums[mid], min);
                //look for left for min element
                high=mid-1;
            }
        }
        return min;
    }
}