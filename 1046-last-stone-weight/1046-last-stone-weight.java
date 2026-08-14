class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele: stones){
            pq.add(ele);
        }
        while(pq.size()>1){
            int temp1 = pq.peek();
            pq.remove();
            int temp2 = pq.peek();
            pq.remove();
            if(temp1 == temp2) continue;
            else pq.add(temp1-temp2);
        }
        if(pq.size()==0) return 0;
        return pq.peek();
    }
}