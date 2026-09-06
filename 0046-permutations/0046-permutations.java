class Solution {
    public void swap(int[] nums, int x , int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
    public void helper(int[] nums , int idx , List<List<Integer>> ans){
        if(idx == nums.length){
           List<Integer> list = new ArrayList<>();
           for(int num:nums) list.add(num);
           ans.add(list);
           return;
        }

        for(int i=idx ; i<nums.length; i++){
            swap(nums , idx , i);
            helper(nums, idx+1, ans);
            //backtracking
            swap(nums , idx ,i);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans =  new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }
}