import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int results[]= new int[nums.length];
         int smaller_elements=0;
        for(int i=0;i<nums.length;i++)
        {
            smaller_elements=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]<nums[i])
                {
                    smaller_elements= smaller_elements+1;

                }
            }
            results[i]=smaller_elements;
        }
        return results;
    }
}