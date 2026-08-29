class Solution {
    public int[] minOperations(String boxes) {
        int[]ans = new int[boxes.length()];
        int moves = 0,balls = 0;
        for(int i = 0;i<boxes.length();i++){
            ans[i]+=moves;
            if(boxes.charAt(i)=='1') balls++;
            moves+=balls;
        }
        balls = 0;
        moves = 0;
        for(int i = boxes.length()-1;i>=0;i--){
            ans[i]+=moves;
            if(boxes.charAt(i)=='1') balls++;
            moves+=balls;
        }
        return ans;
    }
}