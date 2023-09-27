class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        
        int i=0, j=nums.length-1;
        int sum = 0;
        while(i<j) {
            sum = nums[i] + nums[j];
            if(sum == target) {
                ans[0] = i+1;
                ans[1] = j+1;
                return ans;
            }
            else if(sum < target)
                i++;
            else
                j--;
        }
        return ans;
    }
}