class Solution {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> count = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!count.containsKey(nums[i]))
            {   
                count.put(nums[i],1);
            }
            else
            {
                count.put(nums[i],count.get(nums[i])+1);
            }
        }
        int max=0;
        int key=0;
        for ( Map.Entry<Integer, Integer> set :count.entrySet() ) {
 
            if(set.getValue() > max)
            {
                max = set.getValue();
                key = set.getKey();
            }
        }

        return key;

        
    }
}