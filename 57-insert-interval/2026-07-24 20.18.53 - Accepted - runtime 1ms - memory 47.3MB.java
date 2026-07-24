class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ll = new ArrayList<>();
        int[][] ans = new int[1][1];
        int i = 0;
        int n = intervals.length;
        while (i < n && intervals[i][1] < newInterval[0]) {
            ll.add(intervals[i]);
            i++;
        }
        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(intervals[i][0], newInterval[0]);
            newInterval[1] = Math.max(intervals[i][1], newInterval[1]);
            i++;
        }
        ll.add(newInterval);
        while (i < n) {
            ll.add(intervals[i]);
            i++;
        }
        return ll.toArray(new int[ll.size()][]);
    }
}