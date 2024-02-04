class Solution {
    #define ll long long
public:
    long long flowerGame(int n, int m) {
        ll even_n = n/2;
        ll odd_n = n-even_n;
        ll even_m = m/2;
        ll odd_m = m-even_m;

        return (even_n*odd_m) + (odd_n*even_m);
    }
};