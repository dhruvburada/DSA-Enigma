class Solution {
    public int[] rearrangeArray(int[] nums) {
        
       ArrayList<Integer> possitive = new ArrayList<>();
       ArrayList<Integer> negative = new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                possitive.add(nums[i]);
            }
            else
            {
                negative.add(nums[i]);
            }
        }
       for(int i=0;i<nums.length/2;i++)
       {
            nums[2*i] = possitive.get(i);
            nums[2*i+1] = negative.get(i);
       }

       return nums;

    }

}