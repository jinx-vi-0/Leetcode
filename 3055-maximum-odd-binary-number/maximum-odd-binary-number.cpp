class Solution {
public:
    string maximumOddBinaryNumber(string s) {
        int cnt = 0;
        for(char c : s)
            if(c == '1')
                cnt++;

        string ans = "";
        if(cnt > 1) {
            int zero = s.length() - cnt - 1;
            for(int i=0; i<cnt-1; i++)
                ans += '1';
            for(int i=0; i<=zero; i++)
                ans += '0';
            ans += '1';
        }
        else {
            for(int i=0; i<s.length()-1; i++)
                ans += '0';
            ans += '1';
        }
        return ans;
    }
};