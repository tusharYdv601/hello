class Solution {
    public int countValidSubarrays(int[] nums, int x) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (check(sum,x)) {
                    c++;
                }

            }
        }
        return c;
    }

    public boolean check(int sum,int x) {
        if (sum % 10 != x) {
            return false;
        }
        while (sum >= 10) {
            sum /= 10;
        }
        return sum == x;
    }
}