class Solution {
    // MEMOIZATION
    // static int[] dp;
    // public int loot(int[] nums , int i){
    //     if(i>=nums.length) return 0;
    //     if(dp[i]!=-1) return dp[i];
    //     int pick = nums[i] + loot(nums , i+2);
    //     int skip = loot(nums , i+1);
    //     int ans = Math.max(pick , skip);
    //     dp[i] = ans;
    //     return ans;
    //     // return dp[i] =  Math.max(pick , skip);
    // }
    // public int rob(int[] nums) {
    //     dp = new int[nums.length];
    //     Arrays.fill(dp , -1);
    //     return loot(nums , 0);
    // }

    // TABULATION
    public int rob(int[] nums){
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0] , nums[1]);
        for(int i=2; i<nums.length; i++){
            dp[i] = Math.max(nums[i] + dp[i-2] , dp[i-1]);
        }
        return dp[nums.length-1];
    }
}