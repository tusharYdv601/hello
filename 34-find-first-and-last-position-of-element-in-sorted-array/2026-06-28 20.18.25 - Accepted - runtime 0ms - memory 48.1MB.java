class Solution {
    public int[] searchRange(int[] arr, int t) {
        return new int[] {
            search(arr,t,true),search(arr,t,false)
        };
    }

    public static int search(int[] arr, int t, boolean isleft) {
        int l = 0;
        int h = arr.length - 1;
        int ans = -1;

        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (arr[mid] == t) {
                ans = mid;
                if (isleft)
                    h = mid - 1;
                else
                    l = mid + 1;

            } else if (arr[mid] < t) {
                l = mid + 1;

            } else {
                h = mid - 1;

            }
        }
        return ans;
    }

}
