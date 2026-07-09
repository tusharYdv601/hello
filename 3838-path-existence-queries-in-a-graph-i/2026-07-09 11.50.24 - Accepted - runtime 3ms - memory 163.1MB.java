class Solution {
    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] arr) {
        int [] group= new int [n];
        int c=0;
        for(int i=1; i<n;i++){
            if(nums[i]-nums[i-1]>maxDiff){
                c++;
            }
            group[i]=c;
        }
        boolean[] ans= new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            int v=arr[i][0];
            int u=arr[i][1];
            ans[i]=(group[u]==group[v]);
        }
        return ans;
        
    }
}