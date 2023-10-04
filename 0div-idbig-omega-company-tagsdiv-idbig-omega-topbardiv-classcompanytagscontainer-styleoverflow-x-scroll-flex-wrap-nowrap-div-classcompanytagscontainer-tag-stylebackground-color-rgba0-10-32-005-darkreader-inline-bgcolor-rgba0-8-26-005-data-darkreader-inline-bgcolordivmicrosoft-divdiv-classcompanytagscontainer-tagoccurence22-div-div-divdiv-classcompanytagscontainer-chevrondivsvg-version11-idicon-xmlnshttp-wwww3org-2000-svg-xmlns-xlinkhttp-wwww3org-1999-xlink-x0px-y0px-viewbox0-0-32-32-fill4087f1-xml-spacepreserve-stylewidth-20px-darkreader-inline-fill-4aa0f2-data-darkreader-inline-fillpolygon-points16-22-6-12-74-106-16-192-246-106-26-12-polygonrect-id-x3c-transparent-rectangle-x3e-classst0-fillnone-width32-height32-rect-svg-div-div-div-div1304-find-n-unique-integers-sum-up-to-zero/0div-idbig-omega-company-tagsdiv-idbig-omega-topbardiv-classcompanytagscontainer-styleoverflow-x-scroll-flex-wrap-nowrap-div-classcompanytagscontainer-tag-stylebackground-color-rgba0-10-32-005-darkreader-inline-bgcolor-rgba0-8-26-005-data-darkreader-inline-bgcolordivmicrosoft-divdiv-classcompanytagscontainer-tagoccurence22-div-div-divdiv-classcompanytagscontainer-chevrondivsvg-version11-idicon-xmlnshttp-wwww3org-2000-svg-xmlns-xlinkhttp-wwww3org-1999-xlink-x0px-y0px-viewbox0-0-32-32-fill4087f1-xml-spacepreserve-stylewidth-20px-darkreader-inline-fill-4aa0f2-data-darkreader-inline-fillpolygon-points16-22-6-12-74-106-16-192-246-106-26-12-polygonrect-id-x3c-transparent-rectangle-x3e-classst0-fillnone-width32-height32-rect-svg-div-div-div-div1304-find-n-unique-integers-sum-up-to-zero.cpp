class Solution {
public:
    vector<int> sumZero(int n) {
        vector<int> ans(n);
        int i=0, j=n-1, cnt=1;
        while(i<j) {
            ans[i] = cnt;
            ans[j] = -cnt;
            i++; j--; cnt++;
        }
        if(n & 1) ans[n/2] = 0;
        return ans;
    }
};