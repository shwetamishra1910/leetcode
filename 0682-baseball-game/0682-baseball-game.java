class Solution {
    public int calPoints(String[] operations) {
        int n =  operations.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(operations[i].equals("C")) st.pop();
            else if(operations[i].equals("D")) st.push(2*st.peek());
            else if(operations[i].equals("+")) {
                int top = st.pop();
                int top2 = st.peek();
                int sum = top + top2;
                st.push(top);
                st.push(sum);
            }
            else{
                st.push(Integer.parseInt(operations[i]));
            }
        }
        int sum = 0;
        while(st.size()!=0){
            sum = sum + st.pop();
        }
        return sum;
    }
}