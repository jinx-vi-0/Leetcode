class Solution {
    public int minOperations(List<Integer> nums, int target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        long sum = 0;
        for(int i : nums) {
            if(i == target) return 0;
            pq.add(i);
            sum+=i;
        }
        if(sum < target) return -1;
        
        int op = 0;
        while(!pq.isEmpty()) {
            int curr = pq.remove();
            //System.out.println(curr);
            if(sum - curr >= target) {
                sum -= curr;
            }
            else if(curr <= target) {
                sum -= curr;
                target -= curr;
            }
            else {
                pq.add(curr/2);
                pq.add(curr/2);
                op++;
            }
            if(target == 0) return op;
        }
        return op;
    }
}