class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int n = tasks.length;
        int m = shifts.length;
        int[] ans = new int[m];
        long[] arr = new long[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i + 1] = arr[i] + tasks[i];
        }
        long ttime = arr[n];
        long curr = 0;

        for (int j = 0; j < m; j++) {
            curr += shifts[j];

            if (curr >= ttime) {
                ans[j] = 0;
                curr = 0;
            } else {
                int idx= Arrays.binarySearch(arr,curr);
                int c= idx>=0?idx:-idx-2;
                ans[j]=n-c;
            }
        }
        return ans;
    }
}