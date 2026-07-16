class Solution {
    public long gcdSum(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            nums[i] = gcd(nums[i], max);
        }
        Arrays.sort(nums);
        long sum = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int g = gcd(nums[i], nums[j]);
            i++;
            j--;
            sum += g;
        }
        return sum;

    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

}