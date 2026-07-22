class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        int c = 1;

        for (int num : target) {
            while (c < num) {
                ans.add("Push");
                ans.add("Pop");
                c++;
            }
            
            ans.add("Push");
            c++;
        }

        return ans;
    }
}