class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;
        int max = n/2;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int x: candyType){
            map.put(x, map.getOrDefault(x,0)+1);
        }
        int max2 = map.size();
        return Math.min(max,max2);
    }
}