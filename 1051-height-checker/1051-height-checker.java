class Solution {
    public int heightChecker(int[] heights) {
        int[] ex = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            ex[i] = heights[i];
        }
        Arrays.sort(ex);
        int count = 0; 
        for(int i=0; i<heights.length; i++){
            if(ex[i]!=heights[i]) count++;
        }
        return count;
    }
}