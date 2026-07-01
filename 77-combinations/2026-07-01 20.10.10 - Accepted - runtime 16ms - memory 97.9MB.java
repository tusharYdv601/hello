class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        combination(1, n, k, curr, ans);
        return ans;
    }

    public static void combination(int q, int n, int k, List<Integer> curr, List<List<Integer>> ans) {
        if (curr.size() == k) {
            ans.add(new ArrayList<>(curr));
            return;
        }
        if (curr.size() + (n - q + 1) < k) return;

        for (int i = q; i <= n; i++) {
            curr.add(i);
            combination(i + 1, n, k, curr, ans);
            curr.remove(curr.size() - 1);
        }

    }
}