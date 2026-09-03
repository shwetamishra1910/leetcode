class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();

        int st = newInterval[0];
        int end = newInterval[1];

        for(int i=0;  i<intervals.length; i++){
            if(end < intervals[i][0]){
                list.add(new int[]{st , end});
                st = intervals[i][0];
                end = intervals[i][1];
            }
            else if(st>intervals[i][1]){
                list.add(new int[]{intervals[i][0] , intervals[i][1]});
            }
            else{
                st = Math.min(st , intervals[i][0]);
                end = Math.max(end , intervals[i][1]);
            }
        }
        list.add(new int[]{st , end});
        return list.toArray(new int[list.size()][]);
    }
}