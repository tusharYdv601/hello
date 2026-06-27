class Solution {
    public boolean searchMatrix(int[][] arr, int t) {
      int l = 0;
		int h = arr.length - 1;
		while (l <= h) {
			int mid = l + (h - l) / 2;
			if (check(arr, t, mid)) {
				return true;
			} else if (arr[mid][0] > t) {
				h = mid - 1;

			} else {
				l = mid + 1;

			}
		}
		return false;
	}
	public static boolean check(int [][]arr, int t, int mid) {
		int l1 = 0;
		int h1 = arr[mid].length - 1;
		while (l1 <= h1) {
			int mid1 = l1 + (h1 - l1) / 2;
			if (arr[mid][mid1] == t) {
				return true;
			} else if (arr[mid][mid1] > t) {
				h1 = mid1 - 1;
			} else {
				l1 = mid1 + 1;
			}
		}
		return false;
	}

}