class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        vector<int> ans(n,1);
        int left=1,right=1;
        int i=0,j=n-1;
        while(i<n && j>=0){

            ans[i]*=left;
            ans[j]*=right;

            left*=nums[i];
            right*=nums[j];

            i++;
            j--;
        }
        return ans;
    }
};