class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = nums.length-1;i>=0;i--){
            int n = nums[i];
            
            while(n>0){
                int dig = n%10;
                list.add(0,dig);
                n=n/10;
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}