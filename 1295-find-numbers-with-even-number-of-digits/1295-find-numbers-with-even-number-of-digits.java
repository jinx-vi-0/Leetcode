class Solution {
    public int findNumbers(int[] nums) {
        int cnt = 0;
        for(int n : nums){
            if(n >= 10 && n < 100 || n >= 1000 && n <= 9999 || n == 100000)
                cnt++;
        }
        return cnt;
    }
}