class Solution {
    public int maxDigitRange(int[] nums) {
        int[] arr = new int[nums.length];
        int ans = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int s = scan(nums[i]);
             max = Math.max(max, s);
            arr[i] = s;
        }
        for (int i = 0; i < nums.length; i++) {
            if (arr[i] == max) {
                ans += nums[i];
            }
        }
        return ans;

    }

    public int scan(int n) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        while (n > 0) {
            int s = n % 10;
            min = Math.min(min, s);
            max = Math.max(max, s);
            n /= 10;
        }
        return max - min;
    }
}