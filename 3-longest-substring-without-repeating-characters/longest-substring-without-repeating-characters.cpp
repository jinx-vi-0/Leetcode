class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        if(s.size() == 0) return 0;
        
        unordered_map<char,int> f;
        int i=0, j=0;
        int ans = 1;

        while(i < s.size() && j < s.size()) {
            while(j < s.size() && !f[s[j]]) {
                f[s[j]]++;
                j++;
            }
            ans = max(ans, j-i);

            while(i<s.size() && f[s[j]]) {
                f[s[i]]--;
                i++;
            }
            if(f[s[j]] == 0) f.erase(s[j]);
        }
        return ans;
    }
};