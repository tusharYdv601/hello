class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<Integer> ll = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        permutation(arr, ll, target, 0, ans);
        return ans;

    }

    public static void permutation(int[] arr, List<Integer> ll, int t, int n, List<List<Integer>> ans) {
        if (t == 0) {
            ans.add(new ArrayList<>(ll));

            return;
        }
        for (int i = n; i < arr.length; i++) {
            if (t >= arr[i]) {
                ll.add(arr[i]);
                permutation(arr, ll, t - arr[i], i, ans);
                ll.removeLast();

            }
        }
    }
}