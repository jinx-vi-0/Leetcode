class Solution {
public:
    string addBinary(string a, string b) {
        string ans = "";
        int i = a.size()-1;
        int j = b.size()-1;

        int f = 0;
        while(i>=0 && j>=0) {
            if(f && a[i] == '0' && b[j] == '0') {
                ans += '1';
                f = 0;
            }
            else if(a[i] == '0' && b[j] == '0') ans += '0';
            else if(f && a[i] == '1' && b[j] == '1') {
                ans += '1';
            }
            else if(a[i] == '1' && b[j] == '1') {
                ans += '0';
                f = 1;
            }
            else if(f) {
                ans += '0';
            }
            else ans += '1';
            i--; j--;
        }
        while(i>=0) {
            if(f && a[i] == '1') {
                ans += '0';
            }
            else if(f) {
                ans += '1';
                f = 0;
            }
            else
                ans += a[i];
            i--;
        }
        while(j>=0) {
            if(f && b[j] == '1') {
                ans += '0';
            }
            else if(f) {
                ans += '1';
                f = 0;
            }
            else
                ans += b[j];
            j--;
        }
        if(f) ans += '1';

        reverse(ans.begin(), ans.end());
        return ans;
    }
};