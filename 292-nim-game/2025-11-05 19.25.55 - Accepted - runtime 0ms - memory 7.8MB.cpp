class Solution {
public:
    bool canWinNim(int n) {
        n=n%4;
        if(n>=1&n<=3){
            return true;
        }
        return false;
    }
};