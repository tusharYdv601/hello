class Solution {
    public int[] singleNumber(int[] arr) {

        int ans = 0;
        for (int i : arr) {
            ans ^= i;
        }
        int mask = ans & (-1 * ans);
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] & mask) == 0) {
                a = a ^ arr[i];
            }
        }
        int b = ans ^ a;
        return new int[] { a, b };
    }
}