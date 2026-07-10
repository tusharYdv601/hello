class Solution {
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean[] r = new boolean[m];
        boolean[] c = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    r[i] = true;
                    c[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (r[i] || c[j]) {
                    arr[i][j] = 0;
                }
            }
        }

    }
}