class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        
        int i=0, j=n-1;
        for(int idx=0; idx<n; idx++) {
            if((nums[idx] & 1) != 1)
                ans[i++] = nums[idx];
            else
                ans[j--] = nums[idx];
        }
        return ans;
    }
}