class Solution {
    public int maximum69Number (int num) {
        char[] digits = String.valueOf(num).toCharArray();
        int n = digits.length;
        for(int i = 0;i<n;i++){
            if(digits[i]=='6'){
                digits[i]='9';
                break;
            }
        }
        int digit = Integer.parseInt(new String(digits));
        return digit;
    }
}