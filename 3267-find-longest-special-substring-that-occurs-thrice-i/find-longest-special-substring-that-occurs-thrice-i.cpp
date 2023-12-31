class Solution {
public:
    int maximumLength(string s) {
        map<pair<char,int>,int> mp;
        int cnt = 0;

        for(int i=0; i<s.length(); i++) {
            cnt = 1;
            mp[{s[i], cnt}]++;

            for(int j=i; j<s.length()-1; j++) {
                if(s[j] == s[j+1]) {
                    cnt++;
                    mp[{s[i], cnt}]++;
                }
                else
                    break;
            }
        }

        int ans = 0;
        for(auto i : mp)
            if(i.second >= 3)
                ans = max(i.first.second, ans);

        return ans == 0 ? -1 : ans;
    }
};