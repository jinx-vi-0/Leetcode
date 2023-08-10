class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] s = new String[score.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i : score) pq.add(i);
        
        HashMap<Integer, String> map = new HashMap<>();
        int idx = 1;
        
        while(!pq.isEmpty()) {
            if(idx == 1) {
                map.put(pq.remove(), "Gold Medal");
            }
            else if(idx == 2) {
                map.put(pq.remove(), "Silver Medal");
            }
            else if(idx == 3) {
                map.put(pq.remove(), "Bronze Medal");
            }
            else map.put(pq.remove(), Integer.toString(idx));
            
            idx++;
        }
        for(int i=0; i<score.length; i++) s[i] = map.get(score[i]);
        
        return s;
    }
}