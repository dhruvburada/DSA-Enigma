class Solution {
    public void sortColors(int[] nums) {
        int[] hash = new int[3];
        for(int i=0;i<nums.length;i++)
        {
            hash[nums[i]]++;
        }

        for(int i=0;i<hash[0];i++)
        {
            nums[i] = 0;
        }
        for(int i=hash[0];i<hash[0]+hash[1];i++)
        {
            nums[i] =1;
        }

        for(int i=hash[0]+hash[1];i<nums.length;i++)
        {
            nums[i]=2;
        }

        
    }
}