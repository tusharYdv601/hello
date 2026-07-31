class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            arr[c - 'a']++;
        }
        int ans = 0;
        int count = 0;
        Arrays.sort(arr);
        for (int i = 25; i >= 0; i--) {
            if (arr[i] == 0) {
                break;
            }
            ans = ans + arr[i] * (count / 8 + 1);
            count++;
        }
        return ans;
    }
}