class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr) {
        Arrays.sort(arr);
        long m=mass;
        for( int n:arr){
            if(m>=n){
                m+=n;
            }
            else{
                return false;
            }
        }
        return true;
        
    }
}