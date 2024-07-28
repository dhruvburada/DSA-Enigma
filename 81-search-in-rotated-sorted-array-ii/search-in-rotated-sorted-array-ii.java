class Solution {
    public boolean search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        int mid;

        while(low<=high)
        {
            mid = (low+high)/2;

            if(nums[mid] == target)
            {
                return true;
            }


            ///Because the array contains duplicate we might end up a edge case
            //where both sides of mid seems to be sorted but they are actually not
            //cuz both the condition will be true for ex
            //[3,1,2,3,3,3,3] here low<=mid also high>=mid both part of array seems to be sorted
            if(nums[low]==nums[mid] && nums[mid]==nums[high])
            {
                low++;
                high--;
                continue;
            }

            if(nums[low]<=nums[mid])
            {
                if(nums[low]<=target && nums[mid]>=target)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else
            {
                if(nums[mid]<=target && nums[high]>=target)
                {
                    low = mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }

        }
        return false;
    }
}