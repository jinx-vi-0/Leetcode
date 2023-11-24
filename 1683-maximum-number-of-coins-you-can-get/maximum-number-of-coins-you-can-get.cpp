class Solution {
public:
    int maxCoins(vector<int>& piles) {
        sort(piles.begin(), piles.end());
        int max_coin = 0;

        for(int i=piles.size()/3; i<piles.size(); i+=2)
            max_coin += piles[i];
        
        return max_coin;
    }
};