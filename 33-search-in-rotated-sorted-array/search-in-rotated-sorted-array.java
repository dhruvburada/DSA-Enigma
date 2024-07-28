class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;
        int mid;

        while(low<=high)
        {
            mid = (low+high)/2;


            //If element is mid return index
            if(nums[mid]==target)
            {
                return mid;
            }

//check left part of the array is sorted or not
            if(nums[low]<=nums[mid])
            {
//if left part is sorted check wether target element is between this sorted part or not
                if(target>=nums[low] && target<=nums[mid])
                {
                    high=mid-1;
                }
//If element is not in left sorted part check in right part 
                else
                {
                    low=mid+1;
                }
            }

//If left part is not sorted then automatically right part will be sorted
            else
            {
//check if the number lies between these sorted range or not
                if(target>=nums[mid] && target<=nums[high])
                {
                    low=mid+1;
                }
//If not then discard the right part and search in unsorted left possition
                else
                {
                    high=mid-1;
                }
            }
        }

//If you dont find element return -1
        return -1;
    }
}