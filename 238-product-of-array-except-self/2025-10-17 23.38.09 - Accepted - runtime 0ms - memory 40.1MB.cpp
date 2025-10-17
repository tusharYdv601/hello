class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        std::vector<int> answer(nums.size());
        int prefix_product = 1;
        for (int i = 0; i <nums.size() ; i++) {
            answer[i] = prefix_product;
            prefix_product *= nums[i];
        }
        int postfix_product = 1;
        for (int i = nums.size()- 1; i >= 0; i--) {
            answer[i] *= postfix_product;
            postfix_product *= nums[i];
        }
        return answer;

    }
};