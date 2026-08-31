class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while(!(st.size()==0) && temp[i]>=temp[st.peek()]){
                st.pop();
            }
            if(!(st.size()==0)){
                ans[i] = st.peek() - i;
            }
            st.push(i);
        }
        return ans;
    }
}