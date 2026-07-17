class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(nums1[i]==nums2[j]){
                    
                        list.add(nums1[i]);
                        nums2[j] = Integer.MAX_VALUE;
                        break;
                    
                }
            }
        }
        int[] nums = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}