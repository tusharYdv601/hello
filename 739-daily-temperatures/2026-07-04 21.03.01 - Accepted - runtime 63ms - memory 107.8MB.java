class Solution {
    public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            while (!st.isEmpty() && arr[i] > arr[st.peek()]) {
                int x = st.pop();
                ans[x] = i - x;
            }
            st.push(i);
        }
        while (!st.isEmpty()) {
            arr[st.pop()] = 0;
        }
        return ans;
    }
}