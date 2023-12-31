class Solution {
public:
    int maximumLength(string s) {
        map<string,int> mp;

        for(int i=0; i<s.length(); i++) {
            string tmp;
            tmp += s[i];
            mp[tmp]++;

            for(int j=i+1; j<s.length(); j++) {
                if(s[j] == s[i]) {
                    tmp += s[j];
                    mp[tmp]++;
                }
                else
                    break;
            }
        }

        int ans = 0;
        for(auto i : mp) {
            if(i.second >= 3) {
                int sz = i.first.length();
                ans = max(sz, ans);
            }
        }

        return ans == 0 ? -1 : ans;
    }
};