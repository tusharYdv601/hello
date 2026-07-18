class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        long ans=0,c=0,x=0;
        int mod=1000000007;
        for(int n:nums){
            if(n<a){
                ans=(ans+c+x)%mod;
            }
            else if(n<=b){
                ans=(ans+x)%mod;
                c++;
            }
            else{
                x++;
            }
        }
        return (int )ans;
    }
}