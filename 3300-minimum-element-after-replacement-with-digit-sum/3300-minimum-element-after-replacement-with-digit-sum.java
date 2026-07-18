class Solution {
    public int minElement(int[] arr) {
        int n = arr.length;
        int ans = arr[0];
        for(int i = 0;i<n;i++){
            int digit = 0;
            int num = arr[i];
            while(num!=0){
                
                int temp = num%10;
                digit+=temp;
                num/=10;
            }
            arr[i] = digit;
        }
        for(int j = 0;j<n;j++){
            ans = Math.min(arr[j],ans);
        }
        return ans;
    }
}