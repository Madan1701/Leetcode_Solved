class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(product(n)%t==0){
                return n;
            }
            n++;
        }
        
    }
    public int product(int n){
        int prod = 1;
        int temp = n;
        while(temp>0){
            int digit = temp%10;
            prod*=digit;
            temp/=10;
        }
        return prod;
    }
}