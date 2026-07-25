class Solution {
    public int minCostClimbingStairs(int[] arr) {
        int n=arr.length;
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = arr[1];
        for (int i = 2; i < arr.length; i++) {
            int jump = dp[i - 1];
            int djump = dp[i - 2];
            dp[i] = arr[i] + Math.min(jump, djump);
        }
        return  Math.min(dp[n - 1], dp[n - 2]);
    }
}