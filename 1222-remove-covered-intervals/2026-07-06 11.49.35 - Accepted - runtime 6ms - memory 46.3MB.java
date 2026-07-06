class Solution {
    public int removeCoveredIntervals(int[][] arr) {
       Arrays.sort(arr, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int ans = 1;
        int j = 0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[j][0] <= arr[i][0] && arr[j][1] >= arr[i][1]) {

                continue;

            }
            j=i;
            ans++;

        }
        return ans;

    }
}