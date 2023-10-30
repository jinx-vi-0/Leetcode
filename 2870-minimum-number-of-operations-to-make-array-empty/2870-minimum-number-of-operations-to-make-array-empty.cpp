class Solution {
public:
    int minOperations(vector<int>& nums) {
        int ans = 0;
        unordered_map<int, int> mp;
        for(auto a : nums) mp[a]++;
        
        for(auto [_, cnt] : mp) {
            if(cnt == 1) return -1;
            ans += cnt / 3 + (cnt % 3 > 0);
        }
        return ans;
    }
};