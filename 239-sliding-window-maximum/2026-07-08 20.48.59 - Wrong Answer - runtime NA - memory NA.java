class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int t = n - k + 1;
        int[] ans = new int[t];
        int j = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        ans[j] = max;
        for (int i = k; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            j++;
            ans[j] = max;
        }
        return ans;
    }
}