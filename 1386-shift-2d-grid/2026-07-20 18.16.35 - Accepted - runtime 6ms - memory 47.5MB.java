class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        int m = grid.length;
        int n = grid[0].length;
        int t = m * n;
        k = k % (m * n);
        for (int r = 0; r < m; r++) {
            List<Integer> row = new ArrayList<>();
            for (int c = 0; c < n; c++) {
                int o=(r*n+c-k+t)%t;
                row.add(grid[o/n][o%n]);
            }
            ans.add(row);
        }
        return ans;
    }
}