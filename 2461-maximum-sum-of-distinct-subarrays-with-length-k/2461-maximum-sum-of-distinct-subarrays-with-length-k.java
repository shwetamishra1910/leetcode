class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        long sum = 0; 
        long ans = 0;
        int i=0;
        for(int j=0; j<nums.length; j++){
            while(map.containsKey(nums[j]) && i<j){
                sum = sum-nums[i];
            map.put(nums[i], map.getOrDefault(nums[i] , 0)-1);
            if(map.get(nums[i])==0){
                map.remove(nums[i]);
            }
            i++;
            }
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
            sum = sum + nums[j];
            if(map.size()==k){
                ans = Math.max(sum , ans);
                sum = sum-nums[i];
                map.put(nums[i], map.getOrDefault(nums[i],0)-1);
                if(map.get(nums[i])==0){
                    map.remove(nums[i]);
                }
                i++;
            }
            
        }
        return ans;
    }
}