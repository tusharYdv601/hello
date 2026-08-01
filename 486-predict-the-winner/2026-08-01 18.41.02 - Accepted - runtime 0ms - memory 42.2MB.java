class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n = nums.length;
        if (n % 2 == 0) {
            return true;
        }
        return make(nums, 0, n - 1, new int[n][n]) >= 0;

    }

    public int make(int[] arr, int i, int j, int[][] dp) {
        if (i == j)
            return arr[i];
        if (dp[i][j] != 0)
            return dp[i][j];

        int r = arr[i] - make(arr, i + 1, j, dp);
        int l = arr[j] - make(arr, i, j - 1, dp);
        return dp[i][j] = Math.max(r, l);

    }
}