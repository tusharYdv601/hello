class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) {
            return 0;
        }
        boolean isNegative = (s.charAt(0) == '-');
        boolean hasSign = (s.charAt(0) == '-' || s.charAt(0) == '+');
        long num = 0;
        int st = hasSign ? 1 : 0;

        for (int i = st; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') {
                break;
            }
            int n = c - '0';
            num = num * 10 + n;
            if (num > Integer.MAX_VALUE) {
                break;
            }

        }
        if (isNegative) {
            num = num * -1;
        }
        if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int) num;

    }
}