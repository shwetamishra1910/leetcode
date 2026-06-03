class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = prices[0];
        for(int i=1; i<prices.length; i++){
            min = Math.min(prices[i] , prices[i-1]);
            maxProfit+= prices[i] - min;
        }
        return maxProfit;
    }
}