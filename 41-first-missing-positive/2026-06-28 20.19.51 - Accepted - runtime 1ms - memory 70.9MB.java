class Solution {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] < nums.length && nums[i] != i && nums[i] >= 0) {
                if (nums[nums[i]] == nums[i]) {
                    i++;
                    continue;
                } else {
                    int temp = nums[nums[i]];
                    nums[nums[i]] = nums[i];
                    nums[i] = temp;
                }

            } else {
                i++;
            }

        }
        i = 1;
        while (i < nums.length) {
            if (i != nums[i]) {
                return i;
            }
            i++;
        }
        return nums[0] == nums.length ? nums.length + 1 : nums.length;

    }
}