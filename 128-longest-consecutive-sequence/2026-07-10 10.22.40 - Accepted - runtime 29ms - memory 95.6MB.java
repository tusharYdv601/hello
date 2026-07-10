class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }
        int ans = 0;

        for (int num : st) {
            if (!st.contains(num - 1)) {
                int c = num;
                int max = 1;
                while (st.contains(c + 1)) {
                    c += 1;
                    max += 1;
                }
                ans = Math.max(ans, max);
            }
        }

        return ans;
    }

}