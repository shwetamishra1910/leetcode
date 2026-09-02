class Solution {
    public List<Integer> partitionLabels(String s) {
        // List<Integer> ans = new ArrayList<>();
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(int i =0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     map.put(ch , i);
        // }
        // int pre = -1;
        // int max = 0;
        // for(int i=0; i<s.length(); i++){
        //     char ch = s.charAt(i);
        //     max =Math.max(max , map.get(ch));
        //     if(max==i){
        //         ans.add(max-pre);
        //         pre = max;
        //     }
        // }
        // return ans;

        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i) , i);
        }
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int max = 0;
        for(int j=0; j<s.length(); j++){
            char ch = s.charAt(j);
             max = Math.max(max , map.get(ch));
            if(max==j){
                list.add(j-i+1);
                i = max + 1;
            }
        }
        return list;
    }
}