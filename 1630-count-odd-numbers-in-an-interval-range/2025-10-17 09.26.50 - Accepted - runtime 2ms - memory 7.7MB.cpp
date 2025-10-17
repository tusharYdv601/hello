
class Solution {
public:
    int countOdds(int low, int high) {
        int total_numbers = high - low + 1;

       
        if (total_numbers % 2 == 0) {
            return total_numbers / 2;
        } 
        
        else {
            
            return total_numbers / 2 + (low % 2);
        }
    }
};