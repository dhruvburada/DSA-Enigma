class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] ans =  new int[nums.length];
        int possitiveIndex=0;
        int negativeIndex=1;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                ans[possitiveIndex] = nums[i];
                possitiveIndex+=2;
            }
            else
            {
                ans[negativeIndex] = nums[i];
                negativeIndex+=2;
            }
        }

        return ans;
    }

}