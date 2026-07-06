class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int ans = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char d = s.charAt(r);
            if (map.containsKey(d)) {
                l = Math.max(l, map.get(d) + 1);
            }
            map.put(d, r);
            ans = Math.max(ans, r - l + 1);

        }
        return ans;

    }
}