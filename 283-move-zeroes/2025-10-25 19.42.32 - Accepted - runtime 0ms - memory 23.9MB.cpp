class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int n=nums.size();
        int i=0,j=0;
        while(i<n && j<n){
            if(nums[i]==0){
                for(j=max(i+1,j);j<n;j++){
                    if(nums[j]!=0){
                        swap(nums[i],nums[j]);
                        j++;
                        break;
                    } 
                }   
            }
            i++;
        }
    }
};