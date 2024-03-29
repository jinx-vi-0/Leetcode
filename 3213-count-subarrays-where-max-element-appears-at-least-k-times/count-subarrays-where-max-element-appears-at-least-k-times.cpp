class Solution {
public:
    long long countSubarrays(vector<int>& nums, int k) {
        long long mx = *max_element(nums.begin(), nums.end());
        long long left = 0, right = 0, ans = 0, cnt = 0;
        while(right < nums.size()) {
            if(nums[right] == mx) cnt++;

            while(cnt >= k) {
                if(nums[left] == mx) cnt--;
                left++;
                ans += nums.size() - right;
            }
            right++;
        }
        return ans;
    }
};