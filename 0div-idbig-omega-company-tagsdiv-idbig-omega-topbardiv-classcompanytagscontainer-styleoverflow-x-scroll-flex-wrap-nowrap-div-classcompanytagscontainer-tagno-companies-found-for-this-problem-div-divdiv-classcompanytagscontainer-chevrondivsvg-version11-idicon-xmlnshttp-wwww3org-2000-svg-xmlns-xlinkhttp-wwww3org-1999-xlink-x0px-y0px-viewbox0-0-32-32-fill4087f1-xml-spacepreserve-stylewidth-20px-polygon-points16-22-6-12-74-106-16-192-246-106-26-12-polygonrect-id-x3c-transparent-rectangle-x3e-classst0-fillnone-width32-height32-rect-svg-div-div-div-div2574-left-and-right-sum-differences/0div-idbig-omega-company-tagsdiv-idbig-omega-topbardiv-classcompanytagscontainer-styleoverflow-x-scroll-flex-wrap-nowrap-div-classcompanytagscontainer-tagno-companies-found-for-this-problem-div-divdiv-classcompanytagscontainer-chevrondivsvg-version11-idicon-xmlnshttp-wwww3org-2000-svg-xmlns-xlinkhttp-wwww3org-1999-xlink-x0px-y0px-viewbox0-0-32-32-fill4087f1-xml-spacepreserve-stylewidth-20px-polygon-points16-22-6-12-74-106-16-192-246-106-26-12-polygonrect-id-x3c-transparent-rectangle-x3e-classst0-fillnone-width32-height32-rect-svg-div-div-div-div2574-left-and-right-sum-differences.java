class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int total_sum = 0;
        
        for(int i : nums)
            total_sum += i;
        
        int curr_sum = 0;
        for(int i=0; i<n; i++) {
            int left_sum = curr_sum;
            int right_sum = total_sum - curr_sum - nums[i];
            
            ans[i] = Math.abs(left_sum - right_sum);
            
            curr_sum += nums[i];
        }
        return ans;
    }
}