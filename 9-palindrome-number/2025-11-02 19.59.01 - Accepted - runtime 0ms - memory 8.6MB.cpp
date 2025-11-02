class Solution {
public:
    bool isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int y = x;
        long long a = 0; 

        while (y > 0) {
            a = (a * 10) + (y % 10);
            y = y / 10;
        }
        return a == x;
    }
};