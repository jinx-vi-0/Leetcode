class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        unordered_map<int, int> mp;
        long long curr_sum = 0, ans = 0;
        int n = nums.size();

        int i=0;
        while(i < k && i < n) {
            mp[nums[i]]++;
            curr_sum += nums[i++];
        }

        if(mp.size() == k) ans = curr_sum;
        while(i < n) {
            mp[nums[i]]++;
            mp[nums[i-k]]--;

            if(mp[nums[i-k]] == 0) mp.erase(nums[i-k]);

            curr_sum += nums[i];
            curr_sum -= nums[i-k];

            if(mp.size() == k) ans = max(ans, curr_sum);
            i++;
        }
        return ans;
    }
};