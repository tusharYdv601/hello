class Solution {
    public int rob(int[] arr) {
        int[] dp = new int[arr.length];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = -1;
        }
        return robber(arr, 0, dp);

    }

    public static int robber(int[] arr, int i, int[] dp) {
        if (i >= arr.length) {
            return 0;
        }
        if (dp[i] != -1) {
            return dp[i];
        }
        int rob = arr[i] + robber(arr, i + 2, dp);
        int dont = robber(arr, i + 1, dp);
        return dp[i] = Math.max(rob, dont);
    }
}