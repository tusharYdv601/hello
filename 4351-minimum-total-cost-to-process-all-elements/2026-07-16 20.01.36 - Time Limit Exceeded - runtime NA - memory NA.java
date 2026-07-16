class Solution {
    public int minimumCost(int[] nums, int k) {
        long mod=1000000007;
        long ans=0;
        long res=k;
        long n=1;

        for(int num: nums ){
            while(num>res){
                ans=(ans+n)%mod;
                res+=k;
                n=(n+1)%mod;
            }
            res-=num;
        }
        return (int)ans;
        
    }
}