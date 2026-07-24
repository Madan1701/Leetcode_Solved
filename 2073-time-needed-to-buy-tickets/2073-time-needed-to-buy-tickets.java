class Solution {
    public int timeRequiredToBuy(int[] nums, int k) {
        int time = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(i<=k){
                time+=Math.min(nums[i],nums[k]);
            }
            else{
                time+=Math.min(nums[i],nums[k]-1);
            }
        }
        return time;
    }
}