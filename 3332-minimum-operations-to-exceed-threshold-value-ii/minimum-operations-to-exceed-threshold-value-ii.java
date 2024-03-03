class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int i : nums)
            pq.add((long)i);

        int op = 0;
        while(pq.size() > 1) {
            long x = pq.remove();
            if(x >= k) return op;
            long y = pq.remove();

            pq.add(Math.min(x,y) * 2L + Math.max(x,y));
            op++;
        }
        return op;
    }
}