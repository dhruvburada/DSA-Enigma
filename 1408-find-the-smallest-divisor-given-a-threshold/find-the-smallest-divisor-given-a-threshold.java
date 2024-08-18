class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = Arrays.stream(nums).max().getAsInt();
        int mid;
        int ans=-1;

        while(low<=high)
        {
            mid=(low+high)/2;
            int sum=0;
            for(int i=0;i<nums.length;i++)
            {
               sum +=(int)Math.ceil((double)nums[i]/(double)mid);
            }
            if(sum<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low = mid+1;
            }


        }

        return ans;
    }
}