class Solution {
    public int maxProduct(int[] nums) {
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (a < n) {
                b = a;
                a = n;
            } else if (b < n) {
                b = n;
            }
        }
        return (a-1)*(b-1);
    }
}