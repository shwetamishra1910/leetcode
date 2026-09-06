class Solution {
    public int trap(int[] ht) {
        int n = ht.length;

        int[] lmax = new int[n];
        lmax[0] = ht[0];
        int[] rmax = new int[n];
        rmax[n-1] = ht[n-1];

        for(int i=1; i<n; i++){
            lmax[i] = Math.max(lmax[i-1] , ht[i]);
        }
        for(int i=n-2; i>=0; i--){
            rmax[i] = Math.max(rmax[i+1] , ht[i]);
        }
        int ans  = 0;
        for(int i=0; i<n; i++){
            int val = Math.min(lmax[i],rmax[i]) - ht[i];
            if(val>0) ans += val;
        }
        return ans;
    }
}