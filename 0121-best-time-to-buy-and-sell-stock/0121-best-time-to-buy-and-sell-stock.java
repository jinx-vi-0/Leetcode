class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<prices.length; i++) {
            // sell price = prices[i];
            if(buyPrice < prices[i]) { // profit
                int profit = prices[i] - buyPrice; // today's profit
                maxProfit = Math.max(profit, maxProfit);
            }
            // if prices[i] i.e. sell price is smaller than buyPrice then
            // buy the stock on that day
            else
                buyPrice = prices[i];
        }
        return maxProfit;
    }
}