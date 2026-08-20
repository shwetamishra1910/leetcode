class Solution {
    static int[] dp;
    public int count(int i , int[] cost){
        if(i>=cost.length) return 0;
        if(dp[i] != -1) return dp[i];
        return dp[i] = cost[i] + Math.min(count(i+1 , cost) , count(i+2 , cost));
    }
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp , -1);
        return Math.min(count( 0 ,cost ) , count(1 , cost));
    }
}