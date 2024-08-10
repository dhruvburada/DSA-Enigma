class Solution {
    public int findPeakElement(int[] nums) {
        int low=1;
        int last_index = nums.length-1;
        int high=nums.length-2;
        int mid;

        if(nums.length==1)
        {
            return 0;
        }
        else if (nums[0]>nums[1])
        {
           return 0;
        }
        else if(nums[last_index]>nums[last_index-1])
        {
            return last_index;
        }
        else
        {
        while(low<=high)
        {
            mid = (low+high)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1])
            {
               return mid;
            }
            else if (nums[mid+1]>nums[mid])
            {
                low=mid+1;
            }
            else
            {
                high = mid-1;
            }
            
            
        }
        }

        return -1;
    }
}