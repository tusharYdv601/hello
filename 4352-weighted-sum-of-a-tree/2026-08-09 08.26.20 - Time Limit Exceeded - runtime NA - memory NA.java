class Solution {
    public long weightedSum(int[] parent, int[] nums) {
        int n = parent.length;
        int[] arr = new int[n];
        int h = 0;
        for (int i = 0; i < n; i++) {
            int curr = i;
            int currd = 0;
            while (curr != -1) {
                currd++;
                curr = parent[curr];
            }
            arr[i] = currd;
            h = Math.max(h, currd);
        }
        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += (long) nums[i] * (h - arr[i] + 1);
        }
        return ans;
    }
}