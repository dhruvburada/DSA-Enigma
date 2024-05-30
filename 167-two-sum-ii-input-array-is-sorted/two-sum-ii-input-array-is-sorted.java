class Solution {

    static int search(int[] numbers,int element,int low,int high)
    {
        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(element == numbers[mid] )
            {
                return mid;
            }
            else if (element > numbers[mid])
            {
                low = mid+1;
            }
            else
            {
                high = mid-1;
            }
        }
        return -1;
    }
    public int[] twoSum(int[] numbers, int target) {
        int x;
        int index;
        for(int i=0;i<numbers.length;i++)
        {
            x = target-numbers[i];
            index=search(numbers,x,i+1,numbers.length-1);
            if(index != -1 && index!=i)
            {
                return  new int[]{i+1,index+1};
            }

        }

        return new int[]{};
    }
}