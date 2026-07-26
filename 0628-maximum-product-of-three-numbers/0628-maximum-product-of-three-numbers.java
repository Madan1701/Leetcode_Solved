class Solution {
    public int maximumProduct(int[] nums) {
        int one = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int three = Integer.MIN_VALUE;
        int minOne = Integer.MAX_VALUE;
        int minTwo = Integer.MAX_VALUE;
        for(int num :nums){
            if(num>=one){
                three = second;
                second = one;
                one = num;
            }
            else if(num>=second){
                three = second;
                second = num;
            }
            else if(num>=three){
                three = num;
            }

            if(num<=minOne){
                minTwo = minOne;
                minOne = num;
            }
            else if(num<=minTwo){
                minTwo = num;
            }
        }
        return Math.max(one*second*three,one*minOne*minTwo);
    }
}