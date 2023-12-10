class Solution {
public:
    int candy(vector<int>& ratings) {
        int n = ratings.size();
        vector<int> ans(n, 1);
        for(int i=1; i<n; i++)
            if(ratings[i] > ratings[i-1])
                ans[i] = ans[i-1] + 1;

        for(int i=n-1; i>0; i--)
            if(ratings[i-1] > ratings[i])
                ans[i-1] = max(ans[i] + 1, ans[i-1]);

        int total_candy = 0;
        for(int i : ans)
            total_candy += i;

        return total_candy;
    }
};