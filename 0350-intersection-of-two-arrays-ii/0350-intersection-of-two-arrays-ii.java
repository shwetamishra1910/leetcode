class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer , Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int x : nums2){
            map.put(x , map.getOrDefault(x , 0) +1);
        }
        for(int i=0; i<nums1.length; i++){
            if(map.containsKey(nums1[i])){
                if(map.get(nums1[i])>0) {
                    list.add(nums1[i]);
                    map.put(nums1[i] , map.getOrDefault(nums1[i] , 0)-1);
                }
            }
        }
        int ans[] = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}