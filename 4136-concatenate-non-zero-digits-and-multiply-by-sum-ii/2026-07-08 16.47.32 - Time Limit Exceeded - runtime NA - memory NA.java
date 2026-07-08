class Solution {
    long mod = 1000000007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int[] ans = new int[queries.length];
        int n = s.length();
        int[] arr = new int[n];
        arr[0] = s.charAt(0) - '0';

        for (int i = 1; i < n; i++) {
            int num = s.charAt(i) - '0';
            arr[i] = arr[i - 1] + num;
        }
        for (int i = 0; i < queries.length; i++) {
            int j = queries[i][0];
            int k = queries[i][1];
            long num = make(s, j, k);
            long sum = arr[k] - ((j > 0) ? arr[j - 1] : 0);
            ans[i] = (int) (((sum % mod) * (num % mod)) % mod);

        }
        return ans;
    }

    public long make(String s, int start, int end) {
        long num = 0;
        for (int i = start; i <= end && i < s.length(); i++) {
            int n = s.charAt(i) - '0';
            if (n != 0) {
                num = (num * 10 + n) % mod;
            }
        }
        return num;
    }
}