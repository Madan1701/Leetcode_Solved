class Solution {
    public int findGCD(int[] arr) {
        int small = arr[0];
        int larger = arr[0];
        int n = arr.length;
        for(int i =0;i<n;i++){
            if(arr[i]>larger){
                larger = arr[i];
            }
            if(arr[i]<small){
                small = arr[i];
            }
        }
        int gcd = 1;
        for(int i = 1;i<=small;i++){
            if(small%i==0 && larger%i==0){
                int temp = i;
                gcd = Math.max(gcd,i);
            }

        }
        return gcd;
        
    }
}