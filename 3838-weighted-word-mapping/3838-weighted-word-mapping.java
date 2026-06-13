class Solution {
    public String mapWordWeights(String[] words, int[] weights) {

        StringBuilder ans = new StringBuilder();

        for (String word : words) {

            int sum = 0;

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                sum += weights[ch - 'a'];
            }

            int r = sum % 26;

            char s = (char)('z' - r);

            ans.append(s);
        }

        return ans.toString();
    }
}