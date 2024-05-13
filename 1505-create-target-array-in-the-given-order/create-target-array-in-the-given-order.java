import java.util.*;

class Solution {

    public int[] createTargetArray(int[] nums, int[] index) {
        int target[] = new int[nums.length]; // Create target array with the same length as nums
        Arrays.fill(target, -1111); // Fill target array with a placeholder value

        for (int i = 0; i < target.length; i++) {
            int currentIndex = index[i]; // Get the current index from the index array

            if (target[currentIndex] != -1111) { // Check if the target at currentIndex is not empty
                int j = target.length - 1; // Start shifting elements from the end of the array

                while (j != currentIndex) {
                    target[j] = target[j - 1]; // Shift elements to the right
                    j--; // Decrement j
                }
            }

            target[currentIndex] = nums[i]; // Set the value at currentIndex to nums[i]
        }

        return target;
    }
}
