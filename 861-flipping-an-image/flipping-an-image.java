class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] array:image)
        {
            int i=0;
            int j=array.length-1;

            while(i<=j)
            {
                int temp = 1-array[i];
                array[i] = 1-array[j];
                array[j] = temp;
                i++;
                j--;
            }


        }
        
        return image;
    }
}