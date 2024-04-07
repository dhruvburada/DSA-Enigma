class Solution {
    public int[] getConcatenation(int[] nums) {
        int new_size = 2*nums.length;
        int ans[] = new int[new_size];
        for(int i=0;i<new_size;i++)
        {
            if(i<nums.length)
            {
                ans[i] = nums[i];
            }
            else
            {
                ans[i] = nums[i-nums.length];
            }
        }
        return ans;
    }
}