class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int base = 0;
        for(int i =0; i<n; i++){
            if(grumpy[i]==0) base += customers[i];
        }

        int max = 0;
        int sum = 0;
        int i = 0;
        for(int j=0; j<n; j++){
            if(minutes >= j-i+1){
                if(grumpy[j]==1) sum += customers[j];
            }
            if(minutes<j-i+1){
                if(grumpy[i]==1) sum -= customers[i];
                if(grumpy[j]==1) sum += customers[j];
                i++;
            }
            max = Math.max(sum , max);
        }
        return max+base;
    }
}