class Solution {
    public int[] createTargetArray(final int[] nums, final int[] index) {
        final int n = nums.length;
        final int[] result = new int[n];
        final List<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; ++i)
            list.add(index[i], nums[i]);

        for(int i = 0; i < n; ++i)
            result[i] = list.get(i);

        return result;
    }
}