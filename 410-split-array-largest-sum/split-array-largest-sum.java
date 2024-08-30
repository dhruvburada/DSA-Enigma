import java.util.*;

class Solution {

    public static int max(int[] nums)
    {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max = nums[i];
            }
        }

        return max;
    }

    public static int sum(int[] nums)
    {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }

        return sum;
    }

    public static int requiredsplit(int[] nums,int maxsum)
    {
        int splits=1;
        int sum=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]+sum<=maxsum)
            {
                sum+=nums[i];
            }
            else
            {
                sum=nums[i];
                splits++;
            }

        }

        return splits;
    }
    public int splitArray(int[] nums, int k) {
       int low = max(nums);
       int high = sum(nums);
       int mid;
        while(low<=high)
        {
            mid = (low+high)/2;
            if(requiredsplit(nums,mid)>k)
            {
                low = mid+1;
            }
            else  
            {
                high = mid-1;
            }
        }

        return low;
    }
}