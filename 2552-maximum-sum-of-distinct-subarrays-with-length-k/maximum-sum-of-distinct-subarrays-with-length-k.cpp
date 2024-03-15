class Solution {
public:
    long long maximumSubarraySum(vector<int>& nums, int k) {
        unordered_set<int> st;
        long long curr_sum = 0, ans = 0;
        int n = nums.size();
        for(int i=0, j=0; i<n; i++) {
            while(j < n && st.contains(nums[i])) {
                curr_sum -= nums[j];
                st.erase(nums[j++]);
            }
            
            st.insert(nums[i]);
            curr_sum += nums[i];

            while(j < n && st.size() > k) {
                curr_sum -= nums[j];
                st.erase(nums[j++]);
            }

            if(st.size() == k) ans = max(ans, curr_sum);
        }
        return ans;
    }
};