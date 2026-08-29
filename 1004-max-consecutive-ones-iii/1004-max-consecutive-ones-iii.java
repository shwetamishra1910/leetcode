class Solution {
    public int longestOnes(int[] nums, int k) {
        int ones = 0;
        int i =0;
        int ans = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j]==1) ones++;
            while(j-i+1 - ones >k){
                if(nums[i]==1) ones--;
                i++;
            }
            ans = Math.max(j-i+1 , ans);
        }
        return  ans;
    }
}