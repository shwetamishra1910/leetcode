class Solution {
    public String simplifyPath(String path) {
        String ans = "";
        Stack<String> st = new Stack<>();
        String[] arr = path.split("/");
        for(int i=0; i<arr.length; i++){
            if(arr[i]=="" || arr[i].equals(".")) continue;
            else if(arr[i].equals("..")){
                if(st.size()>0) st.pop();
            }
            else{
                st.push(arr[i]);
            }
        }
        while(st.size()>0){
            ans = "/" + st.pop() + ans;
        }
        if(ans == "") return "/";
        return ans;
    }
}