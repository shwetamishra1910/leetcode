class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0)
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }
        if(map.size()==0) return -1;
        int max = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
           if(nums[i]%2==0){
             int a = map.get(nums[i]);
            if(a>max){
                max = a;
                ans = nums[i];
            }
            if(a==max){
                ans = Math.min(nums[i] , ans);
            }
           }
        }
        return ans;
    }
}