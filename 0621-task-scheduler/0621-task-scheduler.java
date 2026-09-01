class Solution {
    public int leastInterval(char[] tasks, int n) {
        int time = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch:tasks){
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int freq:map.values()){
            pq.add(freq);
        }

        while(pq.size()>0){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0; i<=n; i++){
                if(pq.size()>0){
                    int freq = pq.poll();
                    freq--;
                    if(freq>0){
                        list.add(freq);
                    }
                    time++;
                }
                else{
                    if(list.size()>0) time++;
                }
            }
            for(int freq:list){
              pq.add(freq);
            }
        }
       
    return time;
    }
}