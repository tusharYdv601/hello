class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int tar) {
        List<List<Integer>> ll = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        Arrays.sort(arr);
        make(ll, l, arr, tar, 0);
        return ll;

    }

    public void make(List<List<Integer>> ll, List<Integer> l, int[] arr, int tar, int idx) {
        if (tar == 0) {
            ll.add(new ArrayList<>(l));
            return;
        }
        if (tar < 0)
            return;
        for (int i = idx; i < arr.length; i++) {
            if (i > idx && arr[i] == arr[i - 1])
                continue;
            l.add(arr[i]);
            make(ll, l, arr, tar - arr[i], i + 1);
            l.remove(l.size() - 1);

        }
    }
}