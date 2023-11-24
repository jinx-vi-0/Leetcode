class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        
        int max_coin = 0;

        for(int i=n-2, j=0; i>=j; i-=2, j++)
            max_coin += piles[i];
        
        return max_coin;
    }
}