class Solution {
    public int findShortestSubArray(int[] nums) {
        int ans = Integer.MAX_VALUE;
        int degree = -1;
        HashMap<Integer , Integer> freq = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            freq.put(nums[i] , freq.getOrDefault(nums[i] , 0)+1);
            degree = Math.max(degree , freq.get(nums[i]));
        }

        HashMap<Integer , Integer> first = new HashMap<>();
          for(int i=0; i<nums.length; i++){
           if(!first.containsKey(nums[i]))
             first.put(nums[i] , i);
        }

        HashMap<Integer , Integer> last = new HashMap<>();
        for(int i=0; i<nums.length; i++){
           last.put(nums[i] , i);
        }

       for(int i=0; i<nums.length; i++){
        if(freq.get(nums[i])==degree){
            int val = last.get(nums[i]) - first.get(nums[i]) + 1;
            ans = Math.min(ans , val);
        }
       }
       return ans;

    }
}