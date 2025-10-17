class Solution {
public:
    int singleNumber(vector<int>& nums) {
        int count=2;
        int candiate=0;

        for (int num:nums ){
            if(count==2){
                candiate=num;
                count--;
            }
            else if(candiate==num){
                count=2;

            }
           
        } 
        return candiate;
    }
};