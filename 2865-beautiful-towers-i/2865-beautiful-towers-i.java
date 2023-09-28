class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        long max_sum = 0;
        int n = maxHeights.size();
        for (int i = 0; i < n; i++) {
            long cur = maxHeights.get(i);
            int min = maxHeights.get(i);
            for (int j = i - 1; j >= 0; j--) {
                min = Math.min(min, maxHeights.get(j));
                cur += min;
            }
            min = maxHeights.get(i);
            for (int j = i + 1; j < n; j++) {
                min = Math.min(min, maxHeights.get(j));
                cur += min;
            }
            max_sum = Math.max(max_sum, cur);
        }
        return max_sum;
    }
}