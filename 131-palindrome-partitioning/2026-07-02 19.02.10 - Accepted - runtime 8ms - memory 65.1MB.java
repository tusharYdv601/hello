class Solution {
    public List<List<String>> partition(String q) {

        List<List<String>> ll = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        partition(q, ll, ans);
        return ll;
    }

    public static void partition(String q, List<List<String>> ll, List<String> ans) {
        if (q.length() == 0) {
            ll.add(new ArrayList<String>(ans));
            return;
        }
        for (int i = 1; i <= q.length(); i++) {
            String s = q.substring(0, i);
            if (palindrome(s)) {
                ans.add(s);
                partition(q.substring(i), ll, ans);
                ans.remove(ans.size() - 1);
            }
        }
    }

    public static boolean palindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}