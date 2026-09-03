class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ans = new ArrayList<>();
        int m= mat.length;
        int n = mat[0].length;
        int sr=0; 
        int sc= 0;
        int er = m-1;
        int ec = n-1;

        while(sr<=er && sc<=ec){
            //top
            for(int j=sc; j<=ec; j++){
                ans.add(mat[sr][j]);
            }
            //right
            for(int i=sr+1; i<=er; i++){
                ans.add(mat[i][ec]);
            }
            //bottom
            for(int j=ec-1; j>=sc; j--){
                if(sr==er) break;
                ans.add(mat[er][j]);
            }
            //left
            for(int i=er-1; i>=sr+1; i--){
                if(sc==ec) break;
                ans.add(mat[i][sc]);
            }

            sr++;
            sc++;
            er--;
            ec--;
        }
        return ans;
    }
}