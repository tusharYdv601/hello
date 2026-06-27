class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> ll = new ArrayList<>();

        int cr = 0, cc = 0;
        int mcr = arr.length, mcc = arr[0].length;

        while (cr < mcr && cc < mcc) {

            for (int i = cc; i < mcc; i++) {
                ll.add(arr[cr][i]);
            }
            cr++;
            for (int i = cr; i < mcr; i++) {
                ll.add(arr[i][mcc - 1] );
            }
            mcc--;
            if (cr < mcr) {
                for (int i = mcc - 1; i >= cc; i--) {
                   ll.add(arr[mcr - 1][i] );
                }
                mcr--;
            }
            if (cc < mcc) {
                for (int i = mcr - 1; i >= cr; i--) {
                    ll.add(arr[i][cc] );
                }
                cc++;
            }
        }
        return ll;

    }
}