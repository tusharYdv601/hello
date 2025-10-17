class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        int max = *std::max_element(nums.begin(), nums.end());

        int expected_sum = n * (n + 1) / 2;
        
        int sum = std::accumulate(nums.begin(), nums.end(), 0);
        
        return expected_sum - sum;
    }
};