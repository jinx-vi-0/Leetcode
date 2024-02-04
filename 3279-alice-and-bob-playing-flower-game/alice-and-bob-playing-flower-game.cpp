class Solution {
public:
    long long flowerGame(int n, int m) {
        long long ans = 0;
        long long even_n = n/2;
        long long odd_n = n-even_n;
        long long even_m = m/2;
        long long odd_m = m-even_m;

        ans = (even_n*odd_m) + (odd_n*even_m);
        return ans;
    }
};