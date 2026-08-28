class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int ans = Integer.MAX_VALUE;
        int sum = 0;
        for(int j=0; j<nums.length; j++){
            sum += nums[j];
            if(sum<target) continue;
            while(sum>=target){
                ans = Math.min(ans , j-i+1);
                sum = sum - nums[i];
                i++;
            }
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}