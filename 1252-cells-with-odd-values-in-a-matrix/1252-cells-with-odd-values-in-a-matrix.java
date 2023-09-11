class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int oddCnt = 0;
        int[] row = new int[m];
        int[] col = new int[n];
        
        for(int[] arr : indices) {
            row[arr[0]]++;
            col[arr[1]]++;
        }
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(((row[i] + col[j]) & 1) == 1) oddCnt++;
            }
        }        
        return oddCnt;
    }
}