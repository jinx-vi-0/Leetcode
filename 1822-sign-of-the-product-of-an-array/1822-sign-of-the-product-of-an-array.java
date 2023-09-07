class Solution {
    public int arraySign(int[] nums) {
        int countMinus = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0)
                return 0;
            if(nums[i] < 0)
                countMinus++;
        }
        return (countMinus & 1) == 1 ? -1 : 1;
    }
}