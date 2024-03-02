class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        int i = 0, j = n-1;
        vector<int> ans;
        while(j >= i) {
            if(abs(nums[j]) > abs(nums[i])) {
                ans.push_back(nums[j] * nums[j]);
                j--;
            }
            else {
                ans.push_back(nums[i] * nums[i]);
                i++;
            }
        }
        reverse(ans.begin(), ans.end());
        return ans;
    }
};