class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] mat = new int[m][n];
        
        for(int i=0; i<indices.length; i++) {
            int a = indices[i][0];
            int b = indices[i][1];
            
            for(int j=0; j<n; j++) {
                mat[a][j]++;
            }
            for(int j=0; j<m; j++) {
                mat[j][b]++;
            }
        }
        
        int oddCnt = 0;
        for(int[] arr : mat) {
            for(int it : arr)
                if((it & 1) == 1) oddCnt++;
        }
        return oddCnt;
    }
}