class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i) , map.getOrDefault(s.charAt(i),0)+1);
        }
        int ans = 0;
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))%2==0){
                ans = ans + map.get(s.charAt(i));
            }
            else{
                ans = ans + map.get(s.charAt(i))-1;
                count = 1;
            }
            map.put(s.charAt(i) , 0);
        }
        if(count == 1) ans++;
        return ans;
    }
}