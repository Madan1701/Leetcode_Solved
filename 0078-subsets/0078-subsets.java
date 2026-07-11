class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        subS(0,nums,new ArrayList<>(),ans);
        return ans;
    }
    public void subS(int index,int[] nums,List<Integer> current,List<List<Integer>> ans){
        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[index]);
        subS(index+1,nums,current,ans);

        current.remove(current.size()-1);

        subS(index+1,nums,current,ans);
    }
}