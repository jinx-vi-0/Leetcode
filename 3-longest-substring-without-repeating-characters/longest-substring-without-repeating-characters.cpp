class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.size() == 0) return 0;

        unordered_map<char,int> mp;
        int mx = 1;

        for(int i=0, j=0; i<s.size(); i++) {
            if(mp.find(s[i]) != mp.end())
                j = max(j, mp[s[i]] + 1);


            mp[s[i]] = i;
            mx = max(mx, i-j+1);
        }
        return mx;
    }
};