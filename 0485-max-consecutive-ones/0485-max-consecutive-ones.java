class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int sum = 0, max = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                max = Math.max(max, sum);
                sum = 0;
            }
            else sum += nums[i];
        }
        return Math.max(max, sum);
    }
}