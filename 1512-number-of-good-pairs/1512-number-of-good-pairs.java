class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans = 0;
        int[] count = new int[101];
        
        for (int j : nums) {
            ans += count[j];
            count[j]++;
        }
        return ans;
    }
}