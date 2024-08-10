class Solution {
    public int findPeakElement(int[] nums) {

        //since we are checking for first and last element seperately and we dont want mid=-1 or mid=n thats why we use low and high:
        int low=1;
        int high=nums.length-2;
        int last_index = nums.length-1;
        int mid;

        //If an array has only one element that means it is peak element itself
        if(nums.length==1)
        {
            return 0;
        }
        //If the first element is greater than element in right that means its peak element we dont check in right
        else if (nums[0]>nums[1])
        {
           return 0;
        }

//If the right most element is greater than an element before then its peak element we dont check in right
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