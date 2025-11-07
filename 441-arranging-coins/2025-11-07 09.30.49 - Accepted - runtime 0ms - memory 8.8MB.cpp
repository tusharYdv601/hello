class Solution {
public:
    int arrangeCoins(int n) {
        long long n_ll = (long long)n;
        double k = (std::sqrt(1.0 + 8.0 * n_ll) - 1.0) / 2.0;
        return (int)k;
    }
};