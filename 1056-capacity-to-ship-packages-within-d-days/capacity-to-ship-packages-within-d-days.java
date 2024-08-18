class Solution {


    //To findout wether it is possible to ship all weights with hypothetical capacity (mid) in max_days
    public static boolean ispossible(int[] weights,int max_days,int mid)
    {
        int sum = 0;
        int days = 1;

        for(int i=0;i<weights.length;i++)
        {
           
                sum+=weights[i];
  
            if(sum>mid)
            {
                sum=weights[i];
                days++;
            }
            
            if(days>max_days || weights[i]>mid)
            {
                return false;
            }

        }

      
    return true;
    }

    public static int sumofAll(int[] weights)
    {
        int sum=0;
        for(int i=0;i<weights.length;i++)
        {
            sum += weights[i];
        }

        return sum;
    }
    public int shipWithinDays(int[] weights, int days) 
    {
        int low=1;
        int high = sumofAll(weights);
        int mid;
        int ans =1;

        while(low<=high)
        {
            mid=(low+high)/2;

            if(ispossible(weights,days,mid))
            {
                ans =mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return ans;
    }
}