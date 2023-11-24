class Solution {
    public int maxCoins(int[] piles) {
        int n = piles.length;
        Arrays.sort(piles);
        
        int max_coin = 0;

        for(int i=piles.length/3; i<piles.length; i+=2)
            max_coin += piles[i];
        
        return max_coin;
    }
}