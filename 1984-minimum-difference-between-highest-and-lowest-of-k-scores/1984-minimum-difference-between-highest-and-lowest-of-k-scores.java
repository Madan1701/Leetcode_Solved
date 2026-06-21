class Solution {
    public int minimumDifference(int[] nums, int k) {

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {

            int first = nums[i];
            int last = nums[i + k - 1];

            int diff = last - first;

            if (diff < min) {
                min = diff;
            }
        }

        return min;
    }
}