class Solution {
public:
    string frequencySort(string s) {
        vector<pair<char,int>> v(256);
        for(char ch : s) {
            v[ch].first = ch;
            v[ch].second++;
        }
        
        sort(v.begin(), v.end(), [](auto &a, auto &b) {
            return a.second > b.second;
        });

        string ans = "";
        for(auto it : v) {
            char ch = it.first;
            int freq = it.second;
            while(freq--) {
                ans += ch;
            }
        }
        return ans;
    }
};