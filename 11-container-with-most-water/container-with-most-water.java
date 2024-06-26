class Solution {
    public int maxArea(int[] height) {
        int max_area=0;

        int i=0;
        int j =height.length-1;

        while(i<j)
        {
            int calArea = (j-i) * Math.min(height[i],height[j]);
            if(calArea>max_area)
                {
                    max_area = calArea;
                }
            if(height[i] < height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        
                

        return max_area;
    }
}