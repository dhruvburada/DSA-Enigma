class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int low =  0;
        int high = n1;
        int part_x = (n1+n2+1)/2;
        if(n2<n1)
        {
            return findMedianSortedArrays(nums2, nums1);
        }

        int mid1;
        int mid2;
        while(low<=high)
        {
            mid1 = (low+high)/2;
            mid2 = part_x-mid1;

            int l1 = (mid1>0) ? nums1[mid1-1] : Integer.MIN_VALUE;
            int l2 = (mid2>0) ? nums2[mid2-1] : Integer.MIN_VALUE;

            int r1 = (mid1<n1) ? nums1[mid1] : Integer.MAX_VALUE;
            int r2 = (mid2<n2) ? nums2[mid2] : Integer.MAX_VALUE;

            if(l1<=r2 && l2<=r1)
            {
                if((n1+n2)%2 == 1)
                {
                    return (double) Math.max(l1,l2);
                }
                else
                {
                return (double)((double)(Math.max(l1,l2)+Math.min(r1,r2))/2.0);
                }
            }

            else if (l1>r2)
            {
                high = mid1-1;
            }
            else 
            {
                low=mid1+1;
            }

        }

        return 0;


    }
}