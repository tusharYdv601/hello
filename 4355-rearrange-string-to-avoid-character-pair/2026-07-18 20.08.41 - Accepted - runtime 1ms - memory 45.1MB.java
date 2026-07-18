class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == x) {
                count++;
            } else {
                ans.append(c);
            }
        }
        while (count-- > 0) {
            ans.append(x);
        }
        return ans.toString();
    }
}