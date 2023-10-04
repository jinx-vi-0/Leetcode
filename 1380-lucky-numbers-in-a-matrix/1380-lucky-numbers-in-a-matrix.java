class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int[] row = new int[m];
        int[] col = new int[n];
        
        for(int i=0; i<m; i++) {
            int min = Integer.MAX_VALUE;
            for(int j=0; j<n; j++)
                min = Math.min(min, matrix[i][j]);
            row[i] = min;
        }
        for(int i=0; i<n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j=0; j<m; j++)
                max = Math.max(max, matrix[j][i]);
            col[i] = max;
        }
        
        List<Integer> list = new ArrayList<>();
        for(int i : row)
            for(int j : col)
                if(i == j) 
                    list.add(i);
            
        return list;
    }
}