class Solution {
    public long[] sumOfThree(long n) {
        if (n % 3 == 0) {
            return new long[] { (n / 3) - 1, (n / 3), (n / 3) + 1 };
        }
        return new long[] {};

    }
}