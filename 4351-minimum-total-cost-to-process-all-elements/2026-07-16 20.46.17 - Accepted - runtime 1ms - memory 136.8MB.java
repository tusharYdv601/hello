class Solution {
    public int minimumCost(int[] nums, int k) {
       long mod = 1000000007;
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        if (totalSum <= k) {
            return 0;
        }
        long temp = (totalSum - 1) / k; 
        long a = temp % mod;
        long b = (temp + 1) % mod;
        long ans = ((a * b) / 2) % mod;
        
        return (int) ans;

    }
}