class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int m = 0, i = Integer.MAX_VALUE;
        for(int num : nums) {
            m = Math.max(num, m);
            i = Math.min(num, i);
        }
        return (long)(m - i) * (long)k;
    }
}