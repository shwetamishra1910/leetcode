class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int ans[] = new int[nums.length];
        // int p = 1;
        // int pref[] = new int[nums.length];
        // pref[0] = p;
        // for(int i=1; i<nums.length; i++){
        //     p = p*nums[i-1];
        //     pref[i]= p;
        // }

        // int s = 1;
        // int suf[] = new int[nums.length];
        // suf[nums.length-1] = s;
        // for(int i=nums.length-2; i>=0; i--){
        //     s = s*nums[i+1];
        //     suf[i]= s;
        // }
        // for(int i=0; i<nums.length; i++){
        //     ans[i] = pref[i] * suf[i];
        // }
        // return ans;

        int[] ans = new int[nums.length];
        int pro = 1;
        int zero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0) pro *= nums[i];
            else zero++;
        }
        if(zero>1){
             Arrays.fill(ans , 0);
             return ans;
        }     
        for(int i=0; i<nums.length; i++){
            if(zero==1 && nums[i]==0){
                ans[i] = pro;
            }
            else if(zero==1 && nums[i]!=0){
                ans[i]=0;
            }
            else{
                ans[i] = pro / nums[i];
            }
        }
        return ans;

    }
}