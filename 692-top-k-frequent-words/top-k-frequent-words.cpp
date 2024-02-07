class Solution {
public:
    vector<string> topKFrequent(vector<string>& words, int k) {
        unordered_map<string, int> mp;
        for (string s : words)
            mp[s]++;

        vector<pair<string, int>> v(mp.begin(), mp.end());
        sort(v.begin(), v.end(), [](auto &a, auto &b) {
            if (a.second == b.second) {
                return a.first < b.first;
            }
            return a.second > b.second;
        });

        vector<string> ans;
        for (auto it : v) {
            ans.push_back(it.first);
            k--;
            if (k == 0) break;
        }
        return ans;
    }
};