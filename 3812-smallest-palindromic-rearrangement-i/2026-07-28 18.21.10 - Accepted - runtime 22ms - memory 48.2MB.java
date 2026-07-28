class Solution {
    public String smallestPalindrome(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            arr[c]++;
        }
        StringBuilder r = new StringBuilder();
        StringBuilder m = new StringBuilder();
        

        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 0) {
                r.repeat((char) ('a' + i), arr[i] / 2);

            } else {
                r.repeat((char) ('a' + i), arr[i] / 2);
                m.repeat((char) ('a' + i), 1);

            }
        }

        return r.toString() + m.toString() + r.reverse().toString();

    }
}