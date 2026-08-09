class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        int[] arr = new int[n];
        int h = 0;
        for (int i = 0; i < n; i++) {
            h = Math.max(h, get(i, parent, arr));
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (long) nums[i] * (h - arr[i] + 1);
        }
        return ans;
    }

    public int get(int i, int[] parent, int[] arr) {
        if (i == -1)
            return 0;
        if (arr[i] != 0)
            return arr[i];
        if (parent[i] == -1) {
            arr[i] = 1;

        } else {
            arr[i] = 1 + get(parent[i], parent, arr);
        }
        return arr[i];
    }
}