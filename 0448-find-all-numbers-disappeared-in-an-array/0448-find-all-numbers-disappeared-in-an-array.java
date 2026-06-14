class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n =  nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0) + 1);
        }
        for(int i=1; i<=n; i++){
            if(!map.containsKey(i)) ans.add(i);
        }
        return ans;
    }
}