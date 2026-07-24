class Solution {
    public int uniqueXorTriplets(int[] nums) {
        boolean[] twoXor = new boolean[2048];
        boolean[] threeXor = new boolean[2048];
        for (int a : nums) {
            for (int b : nums) {
                twoXor[a ^ b] = true;
            }
        }

        for (int i = 0; i < 2048; i++) {
            if (twoXor[i]) {
                for (int c : nums) {
                    threeXor[i ^ c] = true;
                }
            }
        }
        int ans = 0;
        for (boolean exists : threeXor) {
            if (exists) {
                ans++;
            }
        }
        
        return ans;
    }
}