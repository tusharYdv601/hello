class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int i =0;
        int j=0;
        if(nums1.size()==1){
            if(nums2.size()==1){
                nums1=nums2;

            }
            return;
        }

        while (i<(m)){
            if(nums1[i]>nums2[j]){
                int temp=nums1[i];
                nums1[i]=nums2[j];
                nums2[j]=temp;
               
                                
            }
            i++;

        }
        while(j<n){
            nums1[j+i]=nums2[j];
            j++;
        }
        
    }
};