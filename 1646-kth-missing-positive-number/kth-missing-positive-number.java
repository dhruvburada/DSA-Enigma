class Solution {
     public  static int findKthPositive(int[] arr, int k) {
        HashMap map = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],i);
        }
        int i=1;
        int counter=0;
        while(counter!=k)
        {
            if(map.containsKey(i))
            {
                i++;
                continue;
            }
            counter=counter+1;
            i+=1;
        }
        return i-1;
    }
}