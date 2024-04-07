class Solution {
    public int[] getConcatenation(int[] nums) {
        int new_size = 2*nums.length;
        int ans[] = new int[new_size];
        for(int i=nums.length;i<new_size;i++)
        {
        ans[i-nums.length] = nums[i-nums.length];
        ans[i] = nums[i-nums.length];
        }
        return ans;
    }
}