class Solution {
public:
    string customSortString(string order, string s) {
        unordered_map<char, int> mp;
        for(auto c : s) mp[c]++;
        string ans = "";
        for(auto c : order) {
            if(mp.find(c) != mp.end()) {
                ans += string(mp[c], c);
                mp.erase(c);
            }
        }
        for(auto it : mp)
            ans += string(it.second, it.first);

        return ans;
    }
};