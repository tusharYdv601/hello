class Solution {
public:
    bool checkself(int n){
        int x = n;
        while(x >0){
            int digit = x%10;
            if(digit == 0) return false;
            if(digit != 0){
                if(n % digit != 0) return false;
            }
            x/= 10;
        }
        return true;
    }
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int>ans;
        for(int i = left ; i <= right ; i++){
            if(checkself(i)) ans.push_back(i);
        }
        return ans;
    }
};