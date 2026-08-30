class Solution {
    public int longestSubarray(int[] nums) {
       int ans = 0;
       int zeros = 0;
       int i = 0;
       for(int j=0; j<nums.length; j++){
        if(nums[j]==0){
            zeros++;
        }
        while(zeros>1){
            if(nums[i]==0){
                zeros--;
            }
            i++;
        }
        ans = Math.max(ans , j-i);
       }
       return ans;
    }
}