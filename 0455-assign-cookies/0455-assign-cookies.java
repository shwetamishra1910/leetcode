class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int n = Math.min(g.length , s.length);
        int gi = 0;
        int si = 0;
        int ans = 0;
        while(gi<g.length && si<s.length){
            if(g[gi]<=s[si]){
                ans++;
                gi++;
                si++;
            }
            else{
                si++;
            }
        }
        return ans;
    }
}