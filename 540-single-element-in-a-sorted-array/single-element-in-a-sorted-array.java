class Solution {
    public int singleNonDuplicate(int[] nums) {
int low = 1;
        int high = nums.length-2;
        int mid;

        //If array size = 1 then first element will be single element
        if(nums.length==1)
        {
            return nums[0];
        }
        //If First Element is not equal to second element that means the first element is the single element
        else if (nums[0]!=nums[1])
        {
            return nums[0];
        }
        //If last element is not same as the second last element that means the last element is single element
        else if (nums[nums.length-1]!=nums[high])
        {
            return nums[nums.length-1];
        }
        else
        {

            while (low<=high) {
             
                mid = (low+high)/2;
                
                

                //If both the element beside mid are not same as mid then element at mid is single element itself
                if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1] )
                {
                    return nums[mid];
                }


                //If we are on the left half of the single element that means two repeating elements will occur on the even,odd indexes
                //If we are standing at the left part and odd index that means check left index(even) has same element as the current index(odd)
                //If we are standing on the even index then we will check if the right index(odd index) has same element or not 
                //If this conditions are true we will search at the right part of the array
                else if((mid%2==1 && nums[mid]==nums[mid-1]) || (mid%2==0 && nums[mid]==nums[mid+1]))
                {
                    low=mid+1;
                } 
                else
                {
                    high=mid-1;
                }
            }
        }

        //dummy return

        return -1;
}
}