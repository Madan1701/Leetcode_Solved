class Solution {
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        int n = coordinates.charAt(1);
        if((ch=='a' || ch=='c' || ch == 'e' || ch=='g') && n%2==0){
            return true;
        }
        else if((ch=='b' || ch=='d' || ch == 'f' || ch=='h') && n%2==1){
            return true;
        }
        else{
            return false;
        }
        
    }
}