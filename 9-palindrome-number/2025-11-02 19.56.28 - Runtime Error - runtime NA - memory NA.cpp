class Solution {
public:
    bool isPalindrome(int x) {
        int y = x;
        int a = 0;
        while (y > 0) {
            a = (a * 10) + (y % 10);
            y = y / 10;
        }
        if (a == x) {
            return true;
        }
        return false;
    }
};