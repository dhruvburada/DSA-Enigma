class Solution {
    public int[] shuffle(int[] nums, int n) 
    {
        int[] ans = new int[nums.length];

        int i =0;
        int j=n;
        int k=0;
        while(i<j && i <nums.length && j<nums.length)
        {
            if(nums.length==2)
            {
                return nums;
            }
            
            if(k%2==0)
            {
            ans[k]=nums[i];
            i+=1;
            }
            else
            {
            ans[k] = nums[j];
            j+=1;
            }
            k=k+1;

        }     
        
    return ans;
    }
}
