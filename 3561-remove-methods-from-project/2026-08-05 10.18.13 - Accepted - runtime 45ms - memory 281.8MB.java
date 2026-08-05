class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] arr) {

        List<Integer>[] ll = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            ll[i] = new ArrayList<>();
        }
        for (int i = 0; i < arr.length; i++) {
            ll[arr[i][0]].add(arr[i][1]);
        }

        boolean[] sup = new boolean[n];
        sup[k] = true;
        Queue<Integer> q = new LinkedList<>();
        q.offer(k);
        while (!q.isEmpty()) {
            int cur = q.poll();
            for (int neg : ll[cur]) {
                if (!sup[neg]) {
                    sup[neg] = true;
                    q.offer(neg);
                }
            }
        }
        boolean can = true;
        for (int[] i : arr) {
            if (!sup[i[0]] && sup[i[1]]) {
                can = false;
                break;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if (!can) {
            for (int i = 0; i < n; i++) {
                ans.add(i);
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (!sup[i]) {
                    ans.add(i);
                }
            }
        }
        return ans;

    }
}