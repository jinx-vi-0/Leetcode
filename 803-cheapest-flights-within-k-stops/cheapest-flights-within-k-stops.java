class Pair{
    int first;
    int second;
    public Pair(int first,int second){
        this.first = first;
        this.second = second;
    }
}
class Info {
    int first, second, third; 
    Info(int first, int second, int third) {
        this.first = first; 
        this.second = second;
        this.third = third; 
    }
}

class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();
        for(int i=0; i<n; i++) {
           adj.add(new ArrayList<>());
        }
        int m = flights.length;
        for(int i=0; i<m; i++) {
           adj.get(flights[i][0]).add(new Pair(flights[i][1], flights[i][2]));
        }
        
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(0, src, 0));
        
        int[] dis = new int[n];
        for(int i=0; i<n; i++) {
            dis[i] = (int)1e9;
        }
        dis[src] = 0;

        while(!q.isEmpty()) {
            Info curr = q.remove();
            int stops = curr.first;
            int node = curr.second;
            int cost = curr.third;
            
            if(stops > k) continue;
            for(Pair p : adj.get(node)) {
                int adjNode = p.first;
                int ew = p.second;
                
                if(cost + ew < dis[adjNode] && stops <= k) {
                    dis[adjNode] = cost + ew;
                    q.add(new Info(stops+1, adjNode, dis[adjNode]));
                }
            }
        }
        if(dis[dst] == (int)1e9) return -1;
        return dis[dst];
    }
}