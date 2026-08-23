class Solution {
    public int findMaxLength(int[] nums) {
       int ans = 0;
       int diff = 0;
       HashMap<Integer,Integer> map = new HashMap<>();
       map.put(0,-1);
       for(int i=0; i<nums.length; i++){
          if(nums[i]==0) diff-- ;
          else diff++ ;
          if(map.containsKey(diff)){
            int length = i - map.get(diff);
            ans = Math.max(length , ans);
          }
          else{
            map.put(diff , i);
          }
       }
       return ans;
    }
}