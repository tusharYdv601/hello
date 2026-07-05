class Solution {
    public int maxChunksToSorted(int[] arr) {
        Stack<Integer> st=new Stack<>();
        for(int i=0; i<arr.length;i++){
            int curr=arr[i];
            while(!st.isEmpty()&&arr[i]<st.peek()){
                curr=Math.max(curr,st.pop());

            }
            st.push(curr);
        }
        return st.size();
        
    }
}