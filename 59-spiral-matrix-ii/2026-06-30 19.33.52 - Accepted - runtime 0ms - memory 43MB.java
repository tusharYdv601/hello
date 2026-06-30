class Solution {
    public int[][] generateMatrix(int n) {
        int[][] arr = new int[n][n];
        int cr = 0, cc = 0;
        int c = 1;
        int mcr = arr.length, mcc = arr[0].length;

        while (cr < mcr && cc < mcc) {

            for (int i = cc; i < mcc; i++) {
                arr[cr][i] = c++;
            }
            cr++;
            for (int i = cr; i < mcr; i++) {
                arr[i][mcc - 1]=c++;
            }
            mcc--;
            if (cr < mcr) {
                for (int i = mcc - 1; i >= cc; i--) {
                    arr[mcr - 1][i]=c++;
                }
                mcr--;
            }
            if (cc < mcc) {
                for (int i = mcr - 1; i >= cr; i--) {
                    arr[i][cc]=c++;
                }
                cc++;
            }
        }
        return arr;

    }
}