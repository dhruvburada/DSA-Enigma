class Solution {
    public int missingNumber(int[] nums) {
        
        int[] hashArray = new int[nums.length+1];
        int missing = -1;
        for(int i=0;i<nums.length;i++)
        {
            hashArray[nums[i]]++;
        }

        for(int i=0;i<hashArray.length;i++)
        {
            if(hashArray[i]==0)
            {
                missing = i;
                break;
            }
            
        }

        return missing;


    }
}