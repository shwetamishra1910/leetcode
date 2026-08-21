class Solution {
    // Memoization
    // static int[] dp;
    // public int count(int i , int[] cost){
    //     if(i>=cost.length) return 0;
    //     if(dp[i] != -1) return dp[i];
    //     return dp[i] = cost[i] + Math.min(count(i+1 , cost) , count(i+2 , cost));
    // }
    // public int minCostClimbingStairs(int[] cost) {
    //     dp = new int[cost.length];
    //     Arrays.fill(dp , -1);
    //     return Math.min(count( 0 ,cost ) , count(1 , cost));
    // }

    //Tabulation

       public int minCostClimbingStairs(int[] cost){
        if(cost.length==1) return cost[0];
        int[] dp = new int[cost.length];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i=2; i<cost.length; i++){
            dp[i] = Math.min(dp[i-1] + cost[i] , dp[i-2] + cost[i]);
        }
        //dp[cost.length] = Math.min(dp[cost.length-1] , dp[cost.length-2]);
        return Math.min(dp[cost.length-1] , dp[cost.length-2]);
       }
}