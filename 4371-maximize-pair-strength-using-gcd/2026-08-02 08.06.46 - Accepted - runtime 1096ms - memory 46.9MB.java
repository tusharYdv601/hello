class Solution {
    public long maxPairStrength(int[] nums) {
        long max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                long a = nums[i], b = nums[j];
                long g = gcd(a, b);
                max = Math.max(max, (a * b) / (g * g));
            }
        }
        return max;
    }

    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}