class Solution {

    public static int max_value(int piles[])
    {
        int max=piles[0];
        for(int i=0;i<piles.length;i++)
        {
            max = Math.max(piles[i],max);
        }
        return max;
    }

    public static int TotalTime(int[] piles,int k_perhour)
    {
        double TotalTime=0;
        for(int i=0;i<piles.length;i++)
        {
            TotalTime+=Math.ceil((double)piles[i]/(double)k_perhour);
        }

        return (int)TotalTime;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
     int high = max_value(piles);
     int mid;
     int ans=1;
     while(low<=high)
     {
        mid = (low+high)/2; 
        if(TotalTime(piles,mid) <=h)
        {

            //can we still complete all piles in less number of bananas ? look left (find min number of k)
            high=mid-1;
        }
        else
        {
            //If total time is more than h then we have to increase ammount of bananas koko can eat per hour
            //look right
            low=mid+1;
        }
        
     }  

     return low;
    }
}