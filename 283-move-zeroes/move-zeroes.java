class Solution {
    public void moveZeroes(int[] nums) {
        
        int j =0;

        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] == 0)
            {
                j = i+1;
                while(nums[j] == 0 && j<nums.length-1)
                {
                    j++;
                }
                nums[i]=nums[j];
                nums[j] =0;

            }
        }

        


    }
}