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
        while(target > 0) {
            int curr = pq.remove();
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
        }
        return op;
    }
}