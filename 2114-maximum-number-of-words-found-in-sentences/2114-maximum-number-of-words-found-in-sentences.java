class Solution {
    public int mostWordsFound(String[] s) {
        int count =0;
        int max = 0;
       for(int i=0; i<s.length; i++){
        String[] s1 = s[i].split(" ");
        count = s1.length;
        max = Math.max(count , max);
       }
       return max;
    }
}