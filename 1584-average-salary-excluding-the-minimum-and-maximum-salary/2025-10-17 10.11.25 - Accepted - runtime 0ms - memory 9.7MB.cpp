class Solution {
public:
    double average(vector<int>& salary) {
       int min= *std::min_element(salary.begin(), salary.end());
        int max = *std::max_element(salary.begin(), salary.end());
        int n=salary.size();
        int sum=0;
        int total_sum = std::accumulate(salary.begin(), salary.end(), sum);
        double avg=(double)(total_sum-max-min)/(n-2);
        return avg;
    }

};