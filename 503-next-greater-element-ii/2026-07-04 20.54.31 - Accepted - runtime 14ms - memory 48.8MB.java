class Solution {
    public int[] nextGreaterElements(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        int i, j = 0;
        Arrays.fill(ans, -1);
        while (j < 2 * ans.length) {
            i = j;
            i = i % arr.length;
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                ans[st.pop()] = arr[i];

            }
            st.push(i);
            j++;
        }
        

        return ans;
    }

}