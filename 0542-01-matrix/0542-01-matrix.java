class Node {
    int first;
    int second;
    int third;
    
    Node(int f, int s, int t) {
        this.first = f;
        this.second = s;
        this.third = t;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int[][] dist = new int[n][m];
        Queue<Node> q = new LinkedList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                if(grid[i][j] == 0) {
                    q.add(new Node(i, j, 0));
                    vis[i][j] = true;
                }
            }
        }
        
        int[] delRow = {-1, 0, 1, 0};
        int[] delCol = {0, 1, 0, -1};
        
        while(!q.isEmpty()) {
            Node curr = q.remove();
            int row = curr.first;
            int col = curr.second;
            int steps = curr.third;
            dist[row][col] = steps;
            for(int i=0; i<4; i++) {
                int nrow = row + delRow[i];
                int ncol = col + delCol[i];
                
                if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && !vis[nrow][ncol]) {
                    vis[nrow][ncol] = true;
                    q.add(new Node(nrow, ncol, steps+1));
                }
            }
        }
        return dist;
    }
}