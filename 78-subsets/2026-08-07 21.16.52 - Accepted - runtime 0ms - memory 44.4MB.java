class Solution {
    public List<List<Integer>> subsets(int[] s) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = s.length;
        for (int i = 0; i < (1 << n); i++) {
            ans.add(SubSequnce(s, i));

        }
        return ans;
    }

    public List<Integer> SubSequnce(int[] s, int i) {
        List<Integer> ll = new ArrayList<>();
        int pos = 0;

        while (i > 0) {
            if ((i & 1) != 0) {
                ll.add(s[pos]);
            }
            i >>= 1;
            pos++;
        }
        return ll;
    }
}