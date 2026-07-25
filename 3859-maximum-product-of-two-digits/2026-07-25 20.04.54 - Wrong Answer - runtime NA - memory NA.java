class Solution {
    public int maxProduct(int n) {
        int sum=1;
        while(n>0){
            sum*=(n%10);
            n/=10;
        }
        return sum;
    }
}