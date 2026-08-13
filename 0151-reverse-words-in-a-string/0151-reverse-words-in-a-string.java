class Solution {
    public String reverseWords(String s) {
        String s1 = s.trim();
        String[] arr = s1.split(" ");
        // int i = 0;
        // int j = arr.length - 1;
        // while(i<j){
        //     String temp = arr[i];
        //     arr[i] = arr[j];
        //     arr[j] = temp;
        // }
        StringBuilder sb = new StringBuilder();
        for(int k=arr.length-1; k>=0; k--){
            if(arr[k] == "") continue;
            sb.append(arr[k]);
           if(k!=0) sb.append(" ");
        }
        return sb.toString();
    }
}