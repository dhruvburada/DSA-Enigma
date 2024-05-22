class Solution {
    public int missingNumber(int[] nums) {
        int end = nums.length;
        int sum=0;
        int nums_sum=0;
        for(int i =0 ;i<=end;i++)
        {
            sum+=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            nums_sum+=nums[i];
        }


        return sum-nums_sum;
    }
}