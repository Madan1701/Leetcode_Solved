class Solution {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-1;j++){
                int count1 = countOnes(arr[j]);
                int count2 = countOnes(arr[j+1]);

                if(count1>count2){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

                else if(count1==count2 && arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
        
    }
    public int countOnes(int n){
        int count = 0;
        while(n>0){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        return count;
    }
}