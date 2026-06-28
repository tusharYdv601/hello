class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=ans+1){
                ++ans;
            }
        
        }   
        return ans;
    }
}