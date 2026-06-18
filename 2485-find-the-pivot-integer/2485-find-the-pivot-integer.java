class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        
        int netsum = 0;
        for(int i=1; i<=n;i++){
           netsum = netsum + i;
            if(netsum == sum - netsum + i) return i;
        }
        return -1;
    }
}