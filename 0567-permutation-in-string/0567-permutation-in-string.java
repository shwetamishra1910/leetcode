class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int[] f1 = new int[26];
        for(int i=0; i<s1.length(); i++){
            char ch = s1.charAt(i);
            f1[ch - 'a']++;
        }
        int left = 0;
        int right = s1.length()-1;
        int[] f2 = new int[26];
        for(int i=left; i<=right; i++){
            char ch = s2.charAt(i);
            f2[ch-'a']++;
        }
        if(Arrays.equals(f1,f2)) return true;
        while(right<s2.length()-1){
        right++;
        char r = s2.charAt(right);
        f2[r - 'a']++;
        char l = s2.charAt(left);
        f2[l - 'a']--;
        left++;
        if(Arrays.equals(f1,f2)) return true;
        }
        return false;
    }
}