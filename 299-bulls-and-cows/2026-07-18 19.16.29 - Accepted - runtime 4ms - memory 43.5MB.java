class Solution {
    public String getHint(String secret, String guess) {
        int[] arr = new int[10];
        int bul = 0;
        int cow = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bul++;
            } else {
                int n = secret.charAt(i) - '0';
                int m = guess.charAt(i) - '0';
                if (arr[n] < 0) {
                    cow++;
                }
                if (arr[m] > 0) {
                    cow++;
                }

                arr[n]++;
                arr[m]--;
            }
        }

        return bul + "A" + cow + "B";
    }
}