class Solution {
    public static int helper(int[]nums , int target , int lo , int hi){
      int mid = lo + (hi - lo)/2;
      if(lo>hi) return -1;
      if(nums[mid]==target) return mid;
      else if(nums[mid]>target) return helper(nums , target, lo , mid-1);
      else return  helper(nums , target, mid+1 , hi); 
    }
    public int search(int[] nums, int target) {
       int lo = 0;
       int hi = nums.length-1;
       return helper(nums,target,lo, hi);
        
    }
}