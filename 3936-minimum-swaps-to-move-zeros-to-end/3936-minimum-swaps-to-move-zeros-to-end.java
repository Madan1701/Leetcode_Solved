class Solution {
    public int minimumSwaps(int[] nums) {
        int n = nums.length;
        int ans = 0;
        int nonz = 0;

        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nonz++;
            } 

        }
        for(int i = 0;i<nonz;i++){
            if(nums[i]==0)
            ans++;
        }
        return ans;
    }
}