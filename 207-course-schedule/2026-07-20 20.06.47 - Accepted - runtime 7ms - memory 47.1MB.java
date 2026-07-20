class Solution {
    public boolean canFinish(int n, int[][] arr) {
        List<List<Integer>> adj = new ArrayList<>(n);
        int[] in = new int[n];
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < arr.length; i++) {
            adj.get(arr[i][1]).add(arr[i][0]);
            in[arr[i][0]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < in.length; i++) {
            if (in[i] == 0) {
                q.add(i);
            }
        }
        int c = 0;
        while (!q.isEmpty()) {
            int r = q.poll();
            c++;
            for (int nbrs : adj.get(r)) {
                in[nbrs]--;
                if (in[nbrs] == 0) {
                    q.add(nbrs);
                }
            }
        }
        return c == n;
    }
}