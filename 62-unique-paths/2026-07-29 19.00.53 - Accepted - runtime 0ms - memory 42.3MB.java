class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return make(m, n, 0, 0, dp);
    }

    public int make(int m, int n, int r, int c, int[][] dp) {
        if (c == n - 1 && r == m - 1) {
            return 1;
        }
        if (c >= n || r >= m) {
            return 0;
        }

        if (dp[r][c] != 0) {
            return dp[r][c];
        }
        int right = make(m, n, r + 1, c, dp);
        int down = make(m, n, r, c + 1, dp);
        return dp[r][c] = right + down;

    }
}