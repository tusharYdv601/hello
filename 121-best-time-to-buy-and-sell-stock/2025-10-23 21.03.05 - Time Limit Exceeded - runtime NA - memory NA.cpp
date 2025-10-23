class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int count=0;
        for(int i=0;i<prices.size();i++){
            for(int j=i+1;j<prices.size();j++){
                if(prices[i]<prices[j]){
                    if(prices[j]-prices[i]>count){
                        count=prices[j]-prices[i];
                    }
                }
            }
        }
        return count;
    }
};