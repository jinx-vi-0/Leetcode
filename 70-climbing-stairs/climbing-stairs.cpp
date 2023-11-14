class Solution {
public:
    int countWays(int n, vector<int> &dp) {
        if(n <= 2)
            return n;
        
        if(dp[n] != -1)
            return dp[n];
        
        return dp[n] = countWays(n-1, dp) + countWays(n-2, dp);
    }
    int climbStairs(int n) {
        vector<int> dp(n+1, -1);
        return countWays(n, dp);
    }
};