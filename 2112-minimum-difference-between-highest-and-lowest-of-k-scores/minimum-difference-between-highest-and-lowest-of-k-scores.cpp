class Solution {
public:
    int minimumDifference(vector<int>& nums, int k) {
        sort(begin(nums), end(nums));
        int ans = INT_MAX;
        for(int i=0, j=k-1; j<nums.size(); i++, j++)
            ans = min(ans, nums[j]- nums[i]);

        return ans;
    }
};