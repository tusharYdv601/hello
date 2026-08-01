class Solution {
    public int minFallingPathSum(int[][] grid) {
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[grid.length][grid[0].length];
        for (int[] a : dp) {
            Arrays.fill(a, -9999999);
        }
        for (int i = 0; i < grid[0].length; i++) {
            ans = Math.min(ans, path(grid, 0, i, dp));
        }
        return ans;
    }

    public static int path(int[][] arr, int cr, int cc, int[][] dp) {
        if (dp[cr][cc] != -9999999) {
            return dp[cr][cc];
        }
        if (cr == arr.length - 1) {
            return arr[cr][cc];
        }

        int ans = Integer.MAX_VALUE;
        for (int col = 0; col < dp.length; col++) {

            if (col != cc) {
                ans = Math.min(ans, path(arr, cr + 1, col, dp));
            }
        }
        return dp[cr][cc] = ans + arr[cr][cc];
    }
}
