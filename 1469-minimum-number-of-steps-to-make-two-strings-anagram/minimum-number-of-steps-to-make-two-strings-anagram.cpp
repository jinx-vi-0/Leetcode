class Solution {
public:
    int minSteps(string s, string t) {
        vector<int> f(26);
        int ans = 0;
        for(int i=0; i<s.length(); i++) {
            f[s[i] - 'a']++;
            f[t[i] - 'a']--;
        }
        for(int i : f)
            if(i > 0) ans += i;
        return ans;
    }
};