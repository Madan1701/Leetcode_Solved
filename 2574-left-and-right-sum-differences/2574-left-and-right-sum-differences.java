class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int left_sum = 0;
        int right_sum = 0;
        int total = 0;
        int[] arr = new int[n];
        for(int i = 0;i<n;i++) {
            total+=nums[i];
        }
        for(int i =0;i<n;i++){
            total -= nums[i];
            right_sum = total;
            arr[i] = Math.abs(left_sum-right_sum);
            left_sum+=nums[i];
        }
        return arr;
    }
}