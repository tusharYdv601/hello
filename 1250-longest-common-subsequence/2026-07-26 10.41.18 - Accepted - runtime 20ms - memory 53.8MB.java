class Solution {
    public int longestCommonSubsequence(String t1, String t2) {
        int[][] dp = new int[t1.length() + 1][t2.length() + 1];
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (t1.charAt(i - 1) == t2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    int f = dp[i - 1][j];
                    int s = dp[i][j - 1];
                    dp[i][j] = Math.max(f, s);
                }
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}