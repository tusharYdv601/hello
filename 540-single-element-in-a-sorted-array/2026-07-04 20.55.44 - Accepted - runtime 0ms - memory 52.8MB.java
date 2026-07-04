class Solution {
    public int singleNonDuplicate(int[] arr) {
        int l = 0;
        int h = arr.length - 1;

        while (l < h) {
            int mid = l + (h - l) / 2;
            if (mid % 2 == 0) {

                if (arr[mid] == arr[mid + 1]) {
                    l = mid + 2;
                } else {

                    h = mid;
                }
            } else {

                if (arr[mid] == arr[mid - 1]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            }

        }
        return arr[l];

    }
}