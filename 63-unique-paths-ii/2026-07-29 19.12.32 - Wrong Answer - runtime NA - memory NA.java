class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {

        int[][] dp = new int[arr.length][arr[0].length];
        return make(arr.length, arr[0].length, 0, 0, dp, arr);
    }

    public int make(int m, int n, int r, int c, int[][] dp, int[][] arr) {
        if (c == n - 1 && r == m - 1) {
            return 1;
        }
        if (c >= n || r >= m) {
            return 0;
        }
        if (arr[r][c] == 1) {
            return 0;
        }

        if (dp[r][c] != 0) {
            return dp[r][c];
        }
        int right = make(m, n, r + 1, c, dp, arr);
        int down = make(m, n, r, c + 1, dp, arr);
        return dp[r][c] = right + down;
    }
}