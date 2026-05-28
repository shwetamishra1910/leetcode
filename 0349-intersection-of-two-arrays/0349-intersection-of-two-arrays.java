class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                list.add(nums2[i]);
            }
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int x:list){
            set2.add(x);
        }
        int arr[] = new int[set2.size()];
        int i=0;
        for(int x:set2){
            arr[i] = x;
            i++;
        }
         return arr;
    }
}