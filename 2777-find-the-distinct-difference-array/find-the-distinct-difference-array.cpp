class Solution {
public:
    vector<int> distinctDifferenceArray(vector<int>& nums) {
        int n = nums.size();
        vector<int> ans;
        set<int> stl;

        for(int i=0; i<n; i++) {
            stl.insert(nums[i]);

            set<int> str;
            for(int j=n-1; j>i; j--) {
                str.insert(nums[j]);
            }
            ans.push_back(stl.size() - str.size());
        }
        return ans;
    }
};