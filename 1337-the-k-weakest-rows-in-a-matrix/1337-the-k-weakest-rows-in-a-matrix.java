class Solution {
    class Row implements Comparable<Row> {
        int soldiers;
        int idx;
        
        public Row(int s, int idx) {
            this.soldiers = s;
            this.idx = idx;
        }
        
        @Override
        public int compareTo(Row r2) {
            if(this.soldiers == r2.soldiers)
                return this.idx - r2.idx;
            else
                return this.soldiers - r2.soldiers;
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<Row> pq = new PriorityQueue<>();
        
        for(int i=0; i<mat.length; i++) {
            int cnt = 0;
            for(int it : mat[i])
                cnt += it == 1 ? 1 : 0;
            pq.add(new Row(cnt, i));
        }
        
        int[] ans = new int[k];
        for(int i=0; i<k; i++)
            ans[i] = pq.remove().idx;
        return ans;
    }
}