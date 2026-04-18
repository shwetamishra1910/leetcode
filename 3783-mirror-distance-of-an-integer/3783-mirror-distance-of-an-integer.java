class Solution {
    public int mirrorDistance(int n) {
        int ori = n;
        int rev = 0;
        while(n!=0){
            rev = rev*10 + n%10;
            n = n/10;
        }
        int ans = Math.abs(rev - ori);
        return ans;
    }
}