class Solution {
    public int countValidPrefixes(String s) {
        int c = 0;
        int c1 = 0;
        int ans = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '0') {
                c++;
            } else {
                c1++;
            }

            if (Math.abs(c - c1) <= 1) {
                ans++;
            }
        }
        return ans;
    }
}