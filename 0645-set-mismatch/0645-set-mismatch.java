class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num , map.getOrDefault(num , 0) +1);
        }
        int duplicate = -1;
        int miss = -1;
        for(int i=1; i<=nums.length; i++){
            if(!map.containsKey(i)) miss = i;
            else if(map.get(i)>1) duplicate = i;
            else continue;
        }
        return new int[] {duplicate , miss};
    }
}