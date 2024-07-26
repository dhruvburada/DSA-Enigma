class Solution {
    public int subarraySum(int[] nums, int k) {
        int counter=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int size = nums.length;
    
        map.put(0,1);
        for(int i=0;i<size;i++)
        {
            sum+=nums[i];
            int prefix = sum - k;
            counter += map.getOrDefault(prefix,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }

        
        
        return counter;
    }
}