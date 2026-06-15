class Solution {
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int i=0; i<tasks.length; i++){
            for(int j=0; j<1; j++){
                int time = tasks[i][j] + tasks[i][j+1];
                min = Math.min(time , min);
            }
        }
        return min;
    }
}