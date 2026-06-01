class Solution {
    public int maxProfit(int[] prices) {
      if(prices.length==1) return 0;

      int min = prices[0];
      int b = 1;
      int max = prices[1];
       int profit =max - min;

       for(int i=1; i<prices.length; i++){
         b++;
         if(b<prices.length){
         max = prices[b];
         }
         min = Math.min(min , prices[b-1]);
         profit = Math.max(profit , max-min);
         
       }
       if(profit<0) return 0;
      else return profit;
    }
}