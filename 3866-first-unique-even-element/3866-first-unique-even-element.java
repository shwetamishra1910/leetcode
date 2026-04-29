import java.util.*;
class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                map.put(nums[i] , map.getOrDefault(nums[i],0)+1);
            }
        }
        for(int i:nums){
            if(map.getOrDefault(i,0)==1)
            return i;
        }
        return -1;

    }
}