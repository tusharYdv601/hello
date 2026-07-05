class Solution {
    public int minimizedMaximum(int n, int[] arr) {
        int l = 1;
        int h = 0;
        for (int val : arr) {
            if (val > h) {
                h = val;
            }
        }
        int ans = -1;
        while (l <= h) {
            int mid = l + (h - l) / 2;
            if (isplaced(n, arr, mid)) {
                ans = mid;
                h = mid - 1;

            } else {
                
                l = mid + 1;

            }
        }
        return ans;

    }

    public  boolean isplaced(int n, int[] arr, int m) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            k += (arr[i] + m - 1) / m;;
            if(k>n){
                return false;
            }
        }
    
        return k<=n;
    }
}