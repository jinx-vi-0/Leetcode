class Solution {
    public int arraySign(int[] nums) {
        int neg = 0, pos = 0;
        for(int i : nums) {
            if(i == 0) return 0;
            if(i < 0) neg++;
            else pos++;
        }
        if((neg & 1) != 1) return 1;
        else return -1;
    }
}