class Solution {
    public int numberOfSubstrings(String s) {
        int ac = 0; int bc = 0; int cc=0;
        int left = 0;
        int right = 0;
        int ans = 0;
        while(right < s.length()){
            if(s.charAt(right)=='a') ac++;
            if(s.charAt(right)=='b') bc++;
            if(s.charAt(right)=='c') cc++;
            while(ac>0 && bc>0 && cc>0){
                ans += s.length() - right;
                if(s.charAt(left)=='a') ac--;
                if(s.charAt(left)=='b') bc--;
                if(s.charAt(left)=='c') cc--;
                left++;
            }

            right++;
        }
        return ans;
    }
}