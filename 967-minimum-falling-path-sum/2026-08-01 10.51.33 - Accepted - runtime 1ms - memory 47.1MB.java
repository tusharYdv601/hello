class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int[] a : dp) {
            Arrays.fill(a, -9999999);
        }
        for (int i = 0; i < matrix[0].length; i++) {
            ans = Math.min(ans, path(matrix, 0, i, dp));
        }
        return ans;
    }

    public int path(int[][] arr, int cr, int cc, int[][] dp) {
        if (cc < 0 || cc >= arr[0].length || cr >= arr.length) {
            return Integer.MAX_VALUE;
        }
        if (cr == arr.length - 1) {
            return arr[cr][cc];
        }
        if (dp[cr][cc] != -9999999) {
            return dp[cr][cc];
        }
        int ld = path(arr, cr + 1, cc - 1, dp);
        int rd = path(arr, cr + 1, cc + 1, dp);
        int d = path(arr, cr + 1, cc, dp);
        return dp[cr][cc] = Math.min(ld, Math.min(rd, d)) + arr[cr][cc];
    }
}
