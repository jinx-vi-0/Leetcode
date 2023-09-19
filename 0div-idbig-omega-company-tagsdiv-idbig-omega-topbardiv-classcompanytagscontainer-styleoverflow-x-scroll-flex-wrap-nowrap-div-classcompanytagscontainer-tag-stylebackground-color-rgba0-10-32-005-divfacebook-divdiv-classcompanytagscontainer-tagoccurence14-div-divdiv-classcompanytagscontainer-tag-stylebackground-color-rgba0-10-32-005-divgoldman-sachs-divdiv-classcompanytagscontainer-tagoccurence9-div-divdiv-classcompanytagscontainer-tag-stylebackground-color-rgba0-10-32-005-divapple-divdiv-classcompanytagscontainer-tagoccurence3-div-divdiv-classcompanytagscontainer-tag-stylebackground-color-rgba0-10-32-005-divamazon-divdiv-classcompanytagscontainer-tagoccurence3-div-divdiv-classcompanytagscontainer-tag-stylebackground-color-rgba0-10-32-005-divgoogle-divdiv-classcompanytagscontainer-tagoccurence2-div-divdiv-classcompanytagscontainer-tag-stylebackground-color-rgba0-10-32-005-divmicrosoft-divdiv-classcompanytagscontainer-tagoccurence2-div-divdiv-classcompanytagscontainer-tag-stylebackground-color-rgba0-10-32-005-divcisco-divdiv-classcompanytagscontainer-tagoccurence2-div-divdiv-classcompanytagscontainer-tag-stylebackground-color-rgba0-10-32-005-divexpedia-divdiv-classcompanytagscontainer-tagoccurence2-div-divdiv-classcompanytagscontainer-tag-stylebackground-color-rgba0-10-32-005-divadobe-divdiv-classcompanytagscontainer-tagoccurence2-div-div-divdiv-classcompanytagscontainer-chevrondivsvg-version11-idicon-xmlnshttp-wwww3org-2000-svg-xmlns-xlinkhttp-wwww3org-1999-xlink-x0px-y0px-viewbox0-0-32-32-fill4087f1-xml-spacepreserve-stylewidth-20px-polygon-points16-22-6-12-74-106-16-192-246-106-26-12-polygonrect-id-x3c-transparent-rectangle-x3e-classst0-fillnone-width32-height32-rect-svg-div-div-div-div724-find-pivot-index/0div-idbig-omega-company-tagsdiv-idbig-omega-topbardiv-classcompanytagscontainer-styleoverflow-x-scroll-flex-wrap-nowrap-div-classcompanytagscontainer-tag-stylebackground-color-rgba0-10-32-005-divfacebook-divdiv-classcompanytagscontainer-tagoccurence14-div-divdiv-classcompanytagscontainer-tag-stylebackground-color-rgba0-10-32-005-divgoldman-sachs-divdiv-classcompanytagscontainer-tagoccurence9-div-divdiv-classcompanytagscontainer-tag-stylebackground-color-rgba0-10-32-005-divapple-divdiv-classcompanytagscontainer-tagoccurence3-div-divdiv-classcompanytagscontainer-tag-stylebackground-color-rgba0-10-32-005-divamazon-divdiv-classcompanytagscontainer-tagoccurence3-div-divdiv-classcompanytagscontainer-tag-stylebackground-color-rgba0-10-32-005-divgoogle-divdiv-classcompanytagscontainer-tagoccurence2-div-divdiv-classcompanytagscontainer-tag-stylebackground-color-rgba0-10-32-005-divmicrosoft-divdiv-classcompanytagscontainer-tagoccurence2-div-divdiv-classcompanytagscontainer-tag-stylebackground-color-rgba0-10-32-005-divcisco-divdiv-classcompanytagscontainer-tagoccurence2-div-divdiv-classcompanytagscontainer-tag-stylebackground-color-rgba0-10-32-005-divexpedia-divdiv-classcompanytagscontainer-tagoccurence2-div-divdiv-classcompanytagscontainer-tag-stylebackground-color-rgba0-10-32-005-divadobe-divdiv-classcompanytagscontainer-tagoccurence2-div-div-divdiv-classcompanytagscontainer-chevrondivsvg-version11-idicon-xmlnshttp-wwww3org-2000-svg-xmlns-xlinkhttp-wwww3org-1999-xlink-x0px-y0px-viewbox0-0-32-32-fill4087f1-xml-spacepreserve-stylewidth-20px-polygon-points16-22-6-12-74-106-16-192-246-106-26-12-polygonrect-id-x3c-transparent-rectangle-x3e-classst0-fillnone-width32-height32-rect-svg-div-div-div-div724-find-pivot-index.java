class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        
        int total_sum = 0;
        for(int i : nums)
            total_sum += i;
        
        int curr_sum = 0;
        for(int i=0; i<n; i++) {
            curr_sum += nums[i];
            
            int left_sum = curr_sum - nums[i];
            int right_sum = total_sum - curr_sum;
            
            if(left_sum == right_sum)
                return i;
        }
        return -1;
    }
}