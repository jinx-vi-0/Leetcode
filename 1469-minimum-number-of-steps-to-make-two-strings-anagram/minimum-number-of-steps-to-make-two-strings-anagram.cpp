class Solution {
public:
    int minSteps(string s, string t) {
        vector<int> f (26,0);
        for(char c : s) {
            f[c-'a']++;
        }
        int ans = 0;
        for(char c : t) {
            if(f[c-'a'] < 1) {
                ans++;
                continue;
            }
            f[c-'a']--;
        }
        return ans;
    }
};