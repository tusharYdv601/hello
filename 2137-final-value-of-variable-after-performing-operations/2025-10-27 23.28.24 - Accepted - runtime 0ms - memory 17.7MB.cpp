class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int X = 0;

        for (const std::string& op : operations) {

            if (op.find('+') != std::string::npos) {
                X++;
            }

            else {
                X--;
            }
        }

        return X;
    }
};