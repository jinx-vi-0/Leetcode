class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        
        for(int[] arr : indices) {
            row[arr[0]]++;
            col[arr[1]]++;
        }
        
        int oddRows = 0;
        for(int i : row) {
            if((i & 1) == 1) oddRows++;
        }
        
        int oddCols = 0;
        for(int i : col) {
            if((i & 1) == 1) oddCols++;
        }
        
        return oddRows * n + oddCols * m - 2*oddRows*oddCols;
    }
}