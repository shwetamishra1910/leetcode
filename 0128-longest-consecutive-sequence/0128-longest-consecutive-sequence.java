class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return 1;
       Arrays.sort(nums);
       int ans = 1;
       int count = 1;
       for(int i=0; i<nums.length-1; i++){
            if(nums[i]==nums[i+1]) continue;
            else if(nums[i+1]-nums[i]==1){
                count++;
                ans = Math.max(ans , count);
            }
            else{
                ans = Math.max(count , ans);
                count = 1;
            }
       }
       return ans;
    }
}