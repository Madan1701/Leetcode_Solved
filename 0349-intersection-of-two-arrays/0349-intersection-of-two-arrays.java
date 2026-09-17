class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums1.length;
        int m = nums2.length;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(nums1[i]);
        }

        for (int i = 0; i < m; i++) {
            if (set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]);   
            }
        }

        return list.stream()
                   .mapToInt(Integer::intValue)
                   .toArray();
    }
}