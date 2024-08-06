class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 0;
        int profit = 0;
        for(;r<prices.length;r++){
            if(prices[r]<prices[l])l=r;
            else profit = Math.max(prices[r]-prices[l],profit);
        }
        return profit ;
    }
}