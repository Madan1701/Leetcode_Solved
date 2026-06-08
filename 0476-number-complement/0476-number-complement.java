class Solution {
    public int findComplement(int num) {
        String binary = Integer.toBinaryString(num);
        String result = "";

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '0') {
                result += '1';
            } else {
                result += '0';
            }
        }

        return Integer.parseInt(result, 2);
    }
}