class Solution {
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int temp = 0;
        for(int i = 0;i<gain.length;i++){
             sum += gain[i];

            if(temp< sum){
                temp = sum;
            }
        }
        return temp;
        
    }
}