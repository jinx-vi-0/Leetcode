class Solution {
public:
    int numberOfSteps(int num) {
        return helper(num, 0);
    }
    int helper(int n, int cnt) {
        if(n == 0)
            return cnt;
        if(n%2 == 0)
            return helper(n/2, cnt+1);
        else
            return helper(n-1, cnt+1);
    }
};