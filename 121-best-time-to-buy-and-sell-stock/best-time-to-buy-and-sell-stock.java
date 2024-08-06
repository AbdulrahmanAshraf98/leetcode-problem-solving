class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int r = 0;
        int profit = 0;
        while(r<prices.length){
            if(prices[r]<prices[l]){
                l= r;
            }
            else {
                profit =  Math.max(prices[r]-prices[l],profit);
            }
            r++;
        } 
        return profit ;
    }
}