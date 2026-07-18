class Solution {
    public long maximumValue(int n, int s, int m) {
        
        if (n == 1) {
            return s;
        }
        long k= n/2;
        long ans= (long)s+(k*m)-(k-1);
        return ans;

    }
}