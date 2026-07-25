class Solution {
    public int maxProduct(int n) {
        int a = 0;
        int b = 0;
       
        while(n>0){
            int m = n % 10;
            n/=10;
            if (a <= m) {
                b=a;
                a = m;
            }else if(b<m){
                b=m;
            }
        }
        return a*b;

    }
}