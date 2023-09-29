//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends




// User function Template for Java

class Node {
    int first;
    int second;
    
    public Node(int f, int s) {
        this.first = f;
        this.second = s;
    }
}
class Solution {

    int numberOfEnclaves(int[][] grid) {
        
        int m = grid.length, n = grid[0].length;
        Queue<Node> q = new LinkedList<>();
        boolean[][] vis = new boolean[m][n];
        
        for(int i=0; i<m; i++) {
            if(!vis[i][0] && grid[i][0] == 1)
                q.add(new Node(i, 0));
            if(!vis[i][n-1] && grid[i][n-1] == 1)
                q.add(new Node(i, n-1));
        }
        for(int j=0; j<n; j++) {
            if(!vis[0][j] && grid[0][j] == 1)
                q.add(new Node(0, j));
            if(!vis[m-1][j] && grid[m-1][j] == 1)
                q.add(new Node(m-1, j));
        }
        
        int[] delrow = {-1, 0, 1, 0};
        int[] delcol = {0, 1, 0, -1};
        
        while(!q.isEmpty()) {
            Node curr = q.remove();
            int row = curr.first;
            int col = curr.second;
            
            vis[row][col] = true;
            for(int i=0; i<4; i++) {
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                
                if(nrow >= 0 && nrow < m && ncol >= 0 && ncol < n && !vis[nrow][ncol] && grid[nrow][ncol] == 1)
                    q.add(new Node(nrow, ncol));
            }
        }
        int cnt = 0;
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 1 && !vis[i][j])
                    cnt++;
            }
        }
        return cnt;
    }
}