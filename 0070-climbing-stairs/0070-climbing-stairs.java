class Solution {
    static int[] dp;
    public int count(int i , int n){
        if(i==n) return 1;
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        int ans = count(i+1 , n)+ count(i+2 , n);
        dp[i] = ans;
        return ans;
    }
    public int climbStairs(int n) {
       dp = new int[n+1];
       Arrays.fill(dp , -1);
       return count(0 , n);
    }
}