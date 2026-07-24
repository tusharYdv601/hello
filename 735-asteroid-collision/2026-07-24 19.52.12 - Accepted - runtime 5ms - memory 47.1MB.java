class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for (int ast : asteroids) {
            boolean check = false;
            while (!st.isEmpty() && ast < 0 && st.peek() > 0) {
                if(st.peek()<Math.abs(ast)){
                    st.pop();
                    continue;
                }else if(st.peek()==Math.abs(ast)){
                    st.pop();
                }
                check=true;
                break;
            }
            if(!check){
                st.push(ast);
            }
        }
        int[] ans= new int[st.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }
        return ans;

    }
}