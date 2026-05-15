class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(st.size()==0) st.push(s.charAt(i));
            else{
                char top = st.peek();
                if(top==s.charAt(i)) st.pop();
                else st.push(s.charAt(i));
            }
        }
        StringBuilder ans = new StringBuilder();
        while(st.size()!=0){
             ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}