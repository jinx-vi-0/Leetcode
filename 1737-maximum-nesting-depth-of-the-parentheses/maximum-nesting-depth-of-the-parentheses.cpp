class Solution {
public:
    int maxDepth(string s) {
        int cnt = 0, mx = 0;
        for(char c : s) {
            if(c == '(')
                cnt++, mx = max(mx, cnt);
            else if(c == ')')
                cnt--;
        }
        return mx;
    }
};