class Solution {
    public int minEatingSpeed(int[] piles, int m) {
        int l = 1;
        int h = -1;
        for (int nums : piles) {
            if (nums > h) {
                h = nums;
            }
        }
        int ans = h;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (issafe(piles, m, mid)) {
                ans = mid;
                h = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;

    }

    public boolean issafe(int[] piles, int hr, int m) {
        long k = 0;
        for (int i = 0; i < piles.length; i++) {
            k += (((long) piles[i] + m - 1) / m);
        }
        return k <= hr;
    }
}