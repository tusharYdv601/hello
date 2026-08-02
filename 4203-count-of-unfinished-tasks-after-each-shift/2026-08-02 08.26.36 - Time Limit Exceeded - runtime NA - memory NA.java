class Solution {
    public int[] countTasks(int[] tasks, int[] shifts) {
        int[] ans = new int[shifts.length];
        int i = 0;
        int cur = tasks[0];
        for (int j = 0; j < shifts.length; j++) {
            int time = shifts[j];
            while (i < tasks.length && time >= cur) {
                time -= cur;
                if (++i < tasks.length) {
                    cur = tasks[i];
                }
            }
            if (i < tasks.length) {
                cur -= time;
                ans[j] = tasks.length - i;
            } else {
                ans[j]=0;
                i = 0;
                cur = tasks[0];
            }
            
        }
        return ans;
    }
}