class Solution {
    public int minDistance(String s, String t) {
        int[][] dp = new int[s.length()][t.length()];
		for (int[] a : dp) {
			Arrays.fill(a, -1);
		}
        return make(s,t,0,0,dp);

    }

    public int make(String s, String t, int i, int j, int[][] dp) {
        if (s.length() == i) {
            return t.length() - j;
        }
        if (j == t.length()) {
            return s.length() - i;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (s.charAt(i) == t.charAt(j)) {
            ans = make(s, t, i + 1, j + 1, dp);
        } else {
            int I = make(s, t, i, j + 1, dp);
            int R = make(s, t, i + 1, j + 1, dp);
            int D = make(s, t, i + 1, j, dp);
            ans = Math.min(R, Math.min(D, I)) + 1;
        }
        return dp[i][j] = ans;
    }
}