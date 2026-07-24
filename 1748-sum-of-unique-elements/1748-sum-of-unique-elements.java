class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int n = nums.length;
        for(int i = 0;i<n;i++){
            if(map.get(nums[i])==1){
                list.add(nums[i]);
            }

        }
        int sum = 0;
        for(int num : list){
            sum+=num;
        }
        return sum;

    }
}