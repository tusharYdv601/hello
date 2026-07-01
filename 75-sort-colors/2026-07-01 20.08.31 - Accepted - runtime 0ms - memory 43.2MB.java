class Solution {
    public void sortColors(int[] nums) {
        int two = nums.length - 1;
        int zero = 0, i = 0;
        while (i <=two) {
            if (nums[i] == 0) {
                swap(nums, i, zero);
                zero++;
                i++;
            } else if (nums[i] == 2) {
                swap(nums, i, two);

                two--;

            } else {
                i++;
            }
        }
    }

    public void swap(int[] nums, int i, int j) {
        int item = nums[j];
        nums[j] = nums[i];
        nums[i] = item;
    }
}