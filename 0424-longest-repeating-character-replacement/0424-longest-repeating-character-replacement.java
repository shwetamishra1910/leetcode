class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();

        int i=0; 
        int maxFreq = 0;
        int ans = 0;
        for(int j=0; j<s.length(); j++){
            char ch = s.charAt(j);
            map.put(ch , map.getOrDefault(ch , 0)+1);
            int windowLen = j-i+1;
            maxFreq = Math.max(maxFreq, map.get(ch));
            while(windowLen-maxFreq>k){
                char left = s.charAt(i);
                map.put(left , map.get(left)-1);
                i++;
                windowLen = j-i+1;
               // maxFreq = Math.max(maxFre)

            }
            ans = Math.max(ans , j-i+1);
        }
        return ans;

    }
}