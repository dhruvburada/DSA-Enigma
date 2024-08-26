class Solution {
    public int findKthPositive(int[] arr, int k) {
    int Numberofmissing=0;
    int low=0;
    int high =arr.length-1;

    int mid=0;
    while(low<=high)
    {
        mid=(low+high)/2;
        Numberofmissing=arr[mid]-mid-1;
        if(Numberofmissing<k)
        {
            low = mid+1;
        }
        else
        {
            high = mid-1;
        }
    }

    return high+k+1;
    }
}