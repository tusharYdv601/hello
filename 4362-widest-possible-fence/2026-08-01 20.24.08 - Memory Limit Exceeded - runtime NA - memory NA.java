class Solution {
    public int maximumWidth(int[] planks) {
        int max = 0;
        for (int i : planks)
            max = Math.max(max, i);
        int[] arr = new int[max + 1];
        for (int i : planks)
            arr[i]++;
        int ans = 0;
        for (int i = 1; i <= 2 * max; i++) {
            int w = (i <= max) ? arr[i] : 0;

            int s = Math.max(1, i - max);
            int end = Math.min(max, i / 2);
            for (int j = s; j <= end; j++) {
                int k = i - j;
                if (j == k) {
                    w += arr[j] / 2;
                } else {
                    w += Math.min(arr[j], arr[k]);
                }
            }

            ans = Math.max(ans, w);
        }

        return ans;
    }

}