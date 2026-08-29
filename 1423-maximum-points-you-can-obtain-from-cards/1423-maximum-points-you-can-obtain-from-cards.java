class Solution {
    public int maxScore(int[] cp, int k) {
        int n = cp.length;
        int total = 0;
        for(int i=0; i<n; i++){
            total  += cp[i];
        }

        int min = Integer.MAX_VALUE;
        int sum = 0;
        int i =0; 
        int x = n-k;
        for(int j=0; j<n; j++){
           sum = sum +cp[j]; 
           if(j-i+1>x) {
            sum = sum-cp[i];
            i++;
           } 
          if(j-i+1==x){
             min = Math.min(min , sum);
          }   
        }
        return total - min;
    }
}