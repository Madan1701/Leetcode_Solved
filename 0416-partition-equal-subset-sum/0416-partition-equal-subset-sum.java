class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int target =sum/2;
        int[][]dp = new int[n][target+1];
        for(int i = 0;i<n;i++){
            dp[i][0] = 1;
        }        
        if(nums[0]<=target){
            dp[0][nums[0]] = 1;
        }
        for(int i = 1;i<n;i++){
            for(int j = 1;j<=target;j++){
                dp[i][j] = dp[i-1][j];
                if(j>=nums[i]){
                    dp[i][j] |= dp[i-1][j-nums[i]];
                }
            }
        }
        return dp[n-1][target] == 1;
    }
}