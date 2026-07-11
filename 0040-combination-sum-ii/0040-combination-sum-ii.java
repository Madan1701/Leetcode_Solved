
class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);

        List<List<Integer>> ans = new ArrayList<>();

        helper(0, target, candidates, new ArrayList<>(), ans);

        return ans;
    }

    private void helper(int index, int target,
                        int[] arr,
                        ArrayList<Integer> ds,
                        List<List<Integer>> ans) {

        // Base Case
        if (target == 0) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = index; i < arr.length; i++) {

            
            if (i > index && arr[i] == arr[i - 1])
                continue;

          
            if (arr[i] > target)
                break;

          
            ds.add(arr[i]);

            helper(i + 1, target - arr[i], arr, ds, ans);

            // Backtrack
            ds.remove(ds.size() - 1);
        }
    }
}