class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[] last = new int[m];
        int j = m - 1;
        for (int i = n - 1; i >= 0 && j >= 0; i--) {
            if (word1.charAt(i) == word2.charAt(j)) {
                last[j] = i;
                j--;
            }
        }

        int[] ans = new int[m];
        boolean check = true;
        j = 0;
        for (int i = 0; i < n; i++) {
            if (j == m) {
                break;
            }
            if (word1.charAt(i) == word2.charAt(j)) {
                ans[j] = i;
                j++;
            } else if (check && (j == m - 1 || i < last[j + 1])) {
                check = false;
                ans[j] = i;
                j++;
            }
        }
        return j == m ? ans : new int[0];

    }
}