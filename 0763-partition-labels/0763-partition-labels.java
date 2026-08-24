class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch , i);
        }
        int pre = -1;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            max =Math.max(max , map.get(ch));
            if(max==i){
                ans.add(max-pre);
                pre = max;
            }
        }
        return ans;
    }
}