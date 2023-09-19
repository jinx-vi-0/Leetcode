class Solution {
    public int findMiddleIndex(int[] nums) {
        int total_sum = 0;
        for(int i : nums)
            total_sum += i;
        
        int curr_sum = 0;
        for(int i=0; i<nums.length; i++) {
            curr_sum += nums[i];
            
            int left_sum = curr_sum - nums[i];
            int right_sum = total_sum - curr_sum;
            if(left_sum == right_sum)
                return i;
        }
        return -1;
    }
}