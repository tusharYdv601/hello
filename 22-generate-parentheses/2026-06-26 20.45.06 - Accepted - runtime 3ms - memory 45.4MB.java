class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ll = new ArrayList<>();
        parent(0, 0, n, "", ll);
        return ll;
    }

    public static void parent(int open, int closed, int n, String ans, List<String> ll) {
        if (open == n && closed == n) {
            ll.add(ans);
            return;
        }
        if (open > n || closed > open) {
            return;
        }
        parent(open + 1, closed, n, ans + "(", ll);
        parent(open, closed + 1, n, ans + ")", ll);
    }

}