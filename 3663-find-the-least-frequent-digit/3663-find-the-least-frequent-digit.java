class Solution {
    public int getLeastFrequentDigit(int n) {
        int m = n;
        HashMap<Integer,Integer> map = new HashMap<>();
        while(n!=0){
            map.put(n%10 , map.getOrDefault(n%10 , 0)+1);
            n = n/10;
        }
        int min = Integer.MAX_VALUE;
        int count = Integer.MAX_VALUE;
        while(m!=0){
           int a =  map.get(m%10);
            if(a<count){
                count = a;
                min = m%10;
            }
            else if(a==count){
                min = Math.min(min , m%10);
            }
            m = m/10;
        }
        return min;
    }
}