class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;

         int odd = 1;
        for (int i = 1; i <= n; i++) {
            oddSum = oddSum + odd;
            odd = odd + 2;
        }

        int even = 2;
        for (int i = 1; i <= n; i++) {
            evenSum = evenSum + even;
            even = even + 2;
        }

        int max = 1;
        int m = Math.min(evenSum, oddSum);

        for (int i = 1; i <= m; i++) {
            if (oddSum % i == 0 && evenSum % i == 0) { 
                max = i; 
            }
        }

        return max;
    }
}