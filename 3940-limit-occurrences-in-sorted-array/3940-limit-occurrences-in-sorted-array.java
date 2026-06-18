class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        list.add(nums[0]);
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                 count++;
                 if(count<=k) list.add(nums[i]);
            }
            else{
                list.add(nums[i]);
                count = 1;
            }
        }
        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}