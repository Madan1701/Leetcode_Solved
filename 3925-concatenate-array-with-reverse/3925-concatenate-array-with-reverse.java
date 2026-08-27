class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int k = 0;
        int[] res = new int[n*2];
        for(int i = 0;i<n;i++){
            res[k] = nums[i];
            k++;
        }
        for(int i = n-1;i>=0;i--){
            res[k] = nums[i];
            k++;
        }
        return res;
    }
}