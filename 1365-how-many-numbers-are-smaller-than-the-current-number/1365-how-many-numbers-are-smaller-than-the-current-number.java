class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        
        int[] cnt = new int[101];
        for(int i=0; i<nums.length; i++) {
            cnt[nums[i]]++;
        }
        
        for(int i=1; i<cnt.length; i++) {
            cnt[i] += cnt[i-1];
        }
        
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i] == 0 ? 0 : cnt[nums[i]-1];
        }
        return ans;
    }
}