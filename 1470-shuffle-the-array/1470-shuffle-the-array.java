class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j=0, k=n;
        for(int i=0; i<ans.length-1; i+=2) {
            ans[i] = nums[j++];
            ans[i+1] = nums[k++];
        }
        return ans;
    }
}