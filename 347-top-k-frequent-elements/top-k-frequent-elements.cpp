class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        for(int i : nums) mp[i]++;

        vector<pair<int,int>> v(mp.begin(), mp.end());
        sort(v.begin(), v.end(), [](auto &a, auto &b) {
            return a.second > b.second;
        });

        vector<int> ans;
        for(auto it : v) {
            ans.push_back(it.first);
            k--;
            if(k == 0) break;
        }
        return ans;
    }
};