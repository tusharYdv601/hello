class Solution {
    public boolean isBipartite(int[][] graph) {

        Queue<bipair> q = new LinkedList<>();
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < graph.length; i++) {
            if (visited.containsKey(i)) {
                continue;
            }
            q.add(new bipair(i, 0));
            while (!q.isEmpty()) {
                bipair v = q.poll();
                if (visited.containsKey(v.vtx)) {
                    if (visited.get(v.vtx) != v.dis) {
                        return false;
                    } else {
                        continue;
                    }
                }
                visited.put(v.vtx, v.dis);

                for (int nbrs : graph[v.vtx]) {
                    if (!visited.containsKey(nbrs)) {
                        q.add(new bipair(nbrs, v.dis + 1));
                    }
                }
            }
        }
        return true;
    }

    static class bipair {
        int vtx;
        int dis;

        public bipair(int vtx, int dis) {
            this.vtx = vtx;
            this.dis = dis;
        }
    }
}