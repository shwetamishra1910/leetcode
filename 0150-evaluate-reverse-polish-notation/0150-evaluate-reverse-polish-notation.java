class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        for(String t : tokens){
            //if char is operator
            if(t.equals("+" )| t.equals("-" ) ||t.equals("*" ) || t.equals("/" )){
                int b = s.pop();
                int a = s.pop();
                if(t.equals("+" )) s.push(a+b);
                else if(t.equals("-" )) s.push(a-b);
                else if(t.equals("*" )) s.push(a*b);
                else if(t.equals("/" )) s.push(a/b);
            }
            //if char is operand
            else{
                s.push(Integer.parseInt(t));
            }
        }
        return s.pop();
    }
}