class Solution {
    public int lengthOfLongestSubstring(String s) {
           if(s.length()==0) return 0;
           HashMap<Character,Integer> map = new HashMap<>();
           int i=0; 
           int j =0;
           int count = 0;
           int max = 0;
           for( j=0; j<s.length(); j++){
            char ch = s.charAt(j);
            if(!map.containsKey(ch) || map.get(ch)<i){
                count = j-i+1;
                max = Math.max(count , max);
                map.put(ch , j);
            }
            else{
                i = map.get(ch) + 1;
                count = j-i+1;
                max = Math.max(max , count);
                map.put(ch , j);

            }
           }
            return max;
    }    

    //     if(s.length()==0) return 0;
    //    int ans = 1;
    //    int count = 0;
    //    HashMap<Character , Integer> map = new HashMap<>();
    //    int i = 0;
    //    while(i<s.length()){
    //     char ch = s.charAt(i);
    //     if(!map.containsKey(ch)){
    //         count++;
    //         map.put(ch , i);
    //         ans = Math.max(ans , count);
    //         i++;
    //     }
    //     else{
    //         i = map.get(ch) + 1;
    //         map.clear();
    //         ans = Math.max(ans , count);
    //         count = 0;
    //     }
    //    }
    //    return ans;

    // if(s.length()==0) return 0;
    // int ans = 1;
    // int count = 0;
    // HashMap<Character , Integer> map = new HashMap<>();
    // for(int i = 0; i<s.length(); i++){
    //     char ch = s.charAt(i);
    //     if(!map.containsKey(ch)){
    //         count++;
    //         map.put(ch , i);
    //         ans = Math.max(ans , count);
    //     }
    //     else{
    //         count = i - map.get(ch);
    //         ans = Math.max(count , ans);
    //         map.put(ch , i);
    //     }
    // }
    // return ans;
    // }
}