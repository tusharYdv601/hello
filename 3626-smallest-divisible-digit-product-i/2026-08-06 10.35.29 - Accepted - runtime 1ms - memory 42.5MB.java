class Solution {
    public int smallestNumber(int n, int t) {
        
        int x = n;
        while (true) {
            int p = 1;

            n=x;
            while (n > 0) {
                if (n % 10 == 0) {
                    return x;
                }
                p *= (n % 10);
                n /= 10;
            }
            if(p%t==0){
                return x;
            }
            x++;
        }

    }
}