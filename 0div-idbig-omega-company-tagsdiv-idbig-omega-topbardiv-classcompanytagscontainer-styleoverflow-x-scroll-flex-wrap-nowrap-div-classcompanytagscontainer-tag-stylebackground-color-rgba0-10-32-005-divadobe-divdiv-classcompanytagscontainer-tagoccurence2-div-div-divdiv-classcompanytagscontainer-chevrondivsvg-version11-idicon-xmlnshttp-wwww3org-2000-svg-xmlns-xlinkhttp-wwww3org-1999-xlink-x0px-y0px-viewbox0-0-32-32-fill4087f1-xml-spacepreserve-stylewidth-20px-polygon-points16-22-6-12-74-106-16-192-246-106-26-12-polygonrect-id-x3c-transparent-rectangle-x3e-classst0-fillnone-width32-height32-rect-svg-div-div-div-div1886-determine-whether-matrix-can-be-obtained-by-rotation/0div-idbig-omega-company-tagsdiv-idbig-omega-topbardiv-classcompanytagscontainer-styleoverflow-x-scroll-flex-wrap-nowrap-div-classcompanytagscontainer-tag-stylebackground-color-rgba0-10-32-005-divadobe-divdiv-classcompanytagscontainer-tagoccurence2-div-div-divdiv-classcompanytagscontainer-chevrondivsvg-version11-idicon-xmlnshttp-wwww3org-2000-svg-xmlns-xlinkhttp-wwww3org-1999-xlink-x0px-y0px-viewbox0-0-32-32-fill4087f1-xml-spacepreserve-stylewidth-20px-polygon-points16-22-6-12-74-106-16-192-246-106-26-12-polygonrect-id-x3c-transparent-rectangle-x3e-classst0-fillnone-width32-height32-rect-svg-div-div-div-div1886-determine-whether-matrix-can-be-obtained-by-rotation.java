class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0; i<4; i++) {
            if(check(mat, target))
                return true;
            rotate(mat);
        }
        return false;
    }
    public boolean check(int[][] mat, int[][] target) {
        int n = mat.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(mat[i][j] != target[i][j])
                    return false;
            }
        }
        return true;
    }
    public void rotate(int[][] mat) {
        int n = mat.length;
        // transpose of a matrix
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        
        // reverse each row
        for(int i=0; i<n; i++) {
            int st = 0, end = n-1;
            while(st < end) {
                int temp = mat[i][st];
                mat[i][st] = mat[i][end];
                mat[i][end] = temp;
                
                st++;
                end--;
            }
        }
    }
}