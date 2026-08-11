class Solution {
    public String reverseVowels(String s) {
        char [] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left<right){
            if(!isVowel(arr[left])){
                left++;
            }
            else if(!isVowel(arr[right])){
                right--;
            }
            else{
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    public static boolean isVowel(char c){
        if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U' ||c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
            return true;
        return false;
    }
}