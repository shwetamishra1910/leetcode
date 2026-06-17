class Solution {
    public int largestAltitude(int[] gain) {
        int net = 0;
        for(int i=0; i<gain.length; i++){
            gain[i] = net + gain[i];
            net = gain[i];
        }
        int max = 0;
        for(int i=0; i<gain.length; i++){
            max = Math.max(max , gain[i]);
        }
        return max;
    }
}