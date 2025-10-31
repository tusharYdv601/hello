class Solution {
public:
    int subsetXORSum(vector<int>& nums) {
        int n = nums.size();
        int totalOR = 0;
        
        for (int num : nums) {
            totalOR |= num;
        }
        
        return totalOR * (1 << (n - 1));
    }
};