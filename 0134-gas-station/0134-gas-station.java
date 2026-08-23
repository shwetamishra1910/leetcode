class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalgas = 0;
        for(int ele:gas){
            totalgas += ele;
        }
        int totalcost = 0;
        for(int ele:cost){
            totalcost += ele;
        }
        if(totalgas<totalcost) return -1;
        int start = 0;
        int cg = 0;
        for(int i=0; i<n; i++){
            cg = cg + gas[i] -cost[i];
            if(cg<0){
                start = i+1;
                cg = 0;
            }
        }
        return start;
    }
}