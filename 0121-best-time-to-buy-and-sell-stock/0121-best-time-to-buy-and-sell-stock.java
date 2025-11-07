class Solution {
    public int maxProfit(int[] prices) {
        int l = 0, maxProfit = 0;
        for(int r = 1; r < prices.length; r++){
            if(prices[r] < prices[l])
               l = r;
            else
               maxProfit = Math.max(maxProfit, prices[r] - prices[l]);
        }
        return maxProfit;
    }
}