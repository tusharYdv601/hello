class Solution {
    public String maximumNumber(String num, int[] change) {
        StringBuilder str = new StringBuilder();
        boolean check = false;
        int i = 0;
        for (i = 0; i < num.length(); i++) {
            int n = num.charAt(i) - '0';
            if (change[n] > n) {
                str.append(change[n]);
                check = true;

            } else if (change[n] < n && check) {
                break;
            } else {
                str.append(n);
            }
        }
        return str.append(num.substring(i)).toString();
    }
}