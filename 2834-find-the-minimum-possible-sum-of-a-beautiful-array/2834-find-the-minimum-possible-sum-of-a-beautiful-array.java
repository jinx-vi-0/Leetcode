class Solution {
    public long minimumPossibleSum(int n, int target) {
        Set<Integer> set = new HashSet<>();     
        long sum = 0;
        for(int i=1; set.size()<n; i++) {
            if(!set.contains(target-i)) {
                sum += i;
                set.add(i);
            }
        }
        return sum;
    }
}