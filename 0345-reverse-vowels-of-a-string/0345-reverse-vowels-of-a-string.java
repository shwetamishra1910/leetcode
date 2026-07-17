class Solution {
    public static boolean isVowel(Character ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') return true;
        else return false;
    }
    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i=0;
        int j = s.length()-1;
        while(i<j){
            if(isVowel(sb.charAt(i))){
                if(isVowel(sb.charAt(j))){
                    //swap
                    char temp = sb.charAt(i);
                    sb.setCharAt(i,sb.charAt(j));
                    sb.setCharAt(j , temp);
                    i++;
                    j--;
                }
                else j--;
            }
            else i++;
        }
        return sb.toString();
    }
}