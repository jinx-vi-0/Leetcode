class Solution {
    public int minimumSum(int n, int k) {
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=1; set.size()<n; i++) {
            if(!set.contains(k-i)) {
                set.add(i);
                sum += i;
            }
        }
        return sum;
    }
}