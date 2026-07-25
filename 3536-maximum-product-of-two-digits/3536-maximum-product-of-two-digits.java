class Solution {
    public int maxProduct(int n) {
        int len = 0;
        int tem= n;
        while(tem>0){
            len++;
            tem/=10;
        }
        int[] arr = new int[len];
        for (int i = len - 1; i >= 0; i--) {
            arr[i] = n % 10;
            n /= 10;
        }
        Arrays.sort(arr);
        int l = arr.length;
        return arr[l-2]*arr[l-1];
    }
}