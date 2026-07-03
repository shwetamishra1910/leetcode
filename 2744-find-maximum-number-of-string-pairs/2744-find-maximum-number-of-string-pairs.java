class Solution {
    public static String reverse(String s){
        String sb = new StringBuilder(s).reverse().toString();
        return sb;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        HashMap<String , Integer> map = new HashMap<>();
        for(int i=0; i<words.length; i++){
            map.put(words[i] , i);
        }
        for(int i=0; i<words.length; i++){
            if(map.containsKey(reverse(words[i])) && map.get(reverse(words[i]))>i) count++;
        }
        return count;
    }
}