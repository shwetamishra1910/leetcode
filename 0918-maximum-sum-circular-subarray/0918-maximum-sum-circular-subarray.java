class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        int maxSum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            maxSum = Math.max(sum , maxSum);
            if(sum<0) sum = 0;
        }
        sum = 0;
        int minSum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            minSum = Math.min(sum , minSum);
            if(sum>0) sum = 0;
        }

        if(maxSum == 0){
            int ans = nums[0];
            for(int i=1; i<nums.length; i++){
                ans = Math.max(ans , nums[i]);
            }
            return ans;
        }
        int totalSum = 0;
        
        for(int i=0; i<nums.length; i++){
            totalSum = totalSum + nums[i];
        }
        int circularSum = totalSum - minSum;
        return Math.max(maxSum , circularSum);
    }
}