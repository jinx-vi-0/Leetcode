class Solution {
public:
    vector<int> numberGame(vector<int>& nums) {
        vector<int> v;
        sort(nums.begin(), nums.end());
        for(int i=1; i<nums.size(); i+=2) {
            v.push_back(nums[i]);
            v.push_back(nums[i-1]);
        }
        return v;
    }
};