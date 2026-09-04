class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums2){
            while(st.size()>0 && st.peek()<num){
                map.put(st.peek() , num);
                st.pop();
            }
            st.push(num); 
        }
        while(st.size()>0){
            map.put(st.pop() , -1);
        }
        int[] ans = new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}