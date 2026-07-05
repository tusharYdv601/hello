class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = { -1, -1, -1 };
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a'] = i;
            ans += Math.min(Math.min(arr[0], arr[1]), arr[2]) + 1;
        }
        return ans;
    }
}