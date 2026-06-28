class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        if (nums.length == 0)
            return 0;
       

        Arrays.sort(nums);
        long ans = 0;
        for (int i = nums.length - 1; i >= nums.length - k; i--) {
            long currentVal = nums[i]; 

            if (mul > 0) {
                currentVal *= mul;
                mul--;
            }

            ans += currentVal;
        }

        return ans;
    }
}