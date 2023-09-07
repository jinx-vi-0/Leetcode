class Solution {
    public int arraySign(int[] nums) {
        int countMinus = 0;
        for(int i : nums) {
            if(i == 0)
                return 0;
            if(i < 0)
                countMinus++;
        }
        return (countMinus & 1) == 1 ? -1 : 1;
    }
}