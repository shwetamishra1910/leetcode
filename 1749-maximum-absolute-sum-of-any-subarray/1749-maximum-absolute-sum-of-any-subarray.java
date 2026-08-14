class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int sum = 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            maxSum = Math.max(sum , maxSum);
            if(sum < 0) sum = 0;
        }

        sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            minSum = Math.min(sum , minSum);
            if(sum > 0) sum = 0;
        }

        return Math.max(Math.abs(minSum) , Math.abs(maxSum));

    }
}