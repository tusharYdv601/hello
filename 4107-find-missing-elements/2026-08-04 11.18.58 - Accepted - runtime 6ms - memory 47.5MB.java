class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0, min = 101;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        Arrays.sort(nums);
        List<Integer> ll = new ArrayList<>();
        int i = 0;

        while (min < max) {
            if (min != nums[i]) {
                ll.add(min);
                min++;

            } else {
                i++;
                min++;

            }

        }

        return ll;

    }
}