class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> ans;
        for (int i = left; i <= right; i++) {

            int num_to_check = i;
            bool is_self_dividing = true;
            while (num_to_check > 0) {
                int digit = num_to_check % 10;
                if (digit == 0 || i % digit != 0) {
                    is_self_dividing = false;
                    break;
                }

                num_to_check = num_to_check / 10;
            }

            if (is_self_dividing) {
                ans.push_back(i);
            }
        }

        return ans;
    }
};