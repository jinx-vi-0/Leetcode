class Solution {
    public int waysToSplitArray(int[] nums) {
        long total_sum = 0, curr_sum = 0;
        for(int i : nums)
            total_sum += i;
        
        int cnt = 0;
        
        for(int i=0; i<nums.length-1; i++) {
            curr_sum += nums[i];
            
            if(2 * curr_sum >= total_sum)
                cnt++;
        }
        return cnt;
    }
}