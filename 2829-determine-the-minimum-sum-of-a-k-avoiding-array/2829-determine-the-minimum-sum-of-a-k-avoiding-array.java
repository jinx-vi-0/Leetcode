class Solution {
    public int minimumSum(int n, int k) {
        int sum = 0;
        int temp = k/2;
        for(int i=1; i<=temp; i++) {
            sum += i;
            n--;
            if(n == 0) return sum;
        }
        temp = k;
        while(n-->0) {
            sum += temp;
            temp++;
        }        
        return sum;
    }
}