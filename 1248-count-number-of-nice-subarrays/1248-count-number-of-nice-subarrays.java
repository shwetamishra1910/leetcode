class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int odds = 0;
        int ans = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==1) odds++;
            int req = odds-k;
            if(map.containsKey(req)){
                ans += map.get(req);
            }
            map.put(odds , map.getOrDefault(odds , 0)+1);
        }
        return ans;
    }
}