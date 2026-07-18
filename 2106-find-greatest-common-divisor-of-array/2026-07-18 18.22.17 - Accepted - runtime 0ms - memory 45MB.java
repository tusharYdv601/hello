class Solution {
    public int findGCD(int[] nums) {
        int a = 0;
        int b = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            a = Math.max(a, nums[i]);
            b = Math.min(b, nums[i]);
        }
        while (b != 0) {
            int rem = b;
            b = a % b;
            a = rem;
        }
        return a;

    }
}