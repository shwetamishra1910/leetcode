class Solution {
    static int[][] dp;
    public static int helper(int m , int n){
        if(m==1 || n==1) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        return dp[m][n] =  helper(m , n-1) + helper(m-1 , n);
    }
    public int uniquePaths(int m, int n) {
        dp = new int[m+1][n+1];
        return helper(m , n);
    }
}