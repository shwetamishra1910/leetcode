class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            int req = ((sum%k)+k)%k;
            if(map.containsKey(req)){
                ans += map.get(req);
            }
            map.put(req , map.getOrDefault(req , 0)+1);
        }
        return ans;
    }
}