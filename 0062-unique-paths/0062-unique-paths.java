class Solution {
    /*Memoization*/
    // static int[][] dp;
    // public static int helper(int m , int n){
    //     if(m==1 || n==1) return 1;
    //     if(dp[m][n]!=0) return dp[m][n];
    //     return dp[m][n] =  helper(m , n-1) + helper(m-1 , n);
    // }
    // public int uniquePaths(int m, int n) {
    //     dp = new int[m+1][n+1];
    //     return helper(m , n);
    // }

    /* Tabulation */
        public int uniquePaths(int m, int n){
            int[][] dp = new int[m+1][n+1];
            for(int i=1; i<m+1; i++){
                for(int j=1; j<n+1; j++){
                    if(i==1 || j==1){
                        dp[i][j] = 1;
                    }
                    else{
                        dp[i][j] = dp[i-1][j] + dp[i][j-1];
                    }
                }
            }
            return dp[m][n];
        }
}