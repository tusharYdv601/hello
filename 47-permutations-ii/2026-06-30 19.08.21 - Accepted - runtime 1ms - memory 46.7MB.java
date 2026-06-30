class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {

        List<List<Integer>> ll = new ArrayList<>();

        make(nums, ll, 0);
        return ll;
    }

    public void make(int[] arr, List<List<Integer>> ll, int idx) {
        if (idx == arr.length) {
            List<Integer> l = new ArrayList<>();
            for (int c : arr)
                l.add(c);
            ll.add(new ArrayList(l));
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            if (canSwap(arr, idx, i)) {
                swap(arr, i, idx);
                make(arr, ll, idx + 1);
                swap(arr, i, idx);
            }
        }
    }

    private boolean canSwap(int[] arr, int start, int curr) {
        for (int i = start; i < curr; i++) {
            if (arr[i] == arr[curr]) {
                return false; 
            }
        }
        return true;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}