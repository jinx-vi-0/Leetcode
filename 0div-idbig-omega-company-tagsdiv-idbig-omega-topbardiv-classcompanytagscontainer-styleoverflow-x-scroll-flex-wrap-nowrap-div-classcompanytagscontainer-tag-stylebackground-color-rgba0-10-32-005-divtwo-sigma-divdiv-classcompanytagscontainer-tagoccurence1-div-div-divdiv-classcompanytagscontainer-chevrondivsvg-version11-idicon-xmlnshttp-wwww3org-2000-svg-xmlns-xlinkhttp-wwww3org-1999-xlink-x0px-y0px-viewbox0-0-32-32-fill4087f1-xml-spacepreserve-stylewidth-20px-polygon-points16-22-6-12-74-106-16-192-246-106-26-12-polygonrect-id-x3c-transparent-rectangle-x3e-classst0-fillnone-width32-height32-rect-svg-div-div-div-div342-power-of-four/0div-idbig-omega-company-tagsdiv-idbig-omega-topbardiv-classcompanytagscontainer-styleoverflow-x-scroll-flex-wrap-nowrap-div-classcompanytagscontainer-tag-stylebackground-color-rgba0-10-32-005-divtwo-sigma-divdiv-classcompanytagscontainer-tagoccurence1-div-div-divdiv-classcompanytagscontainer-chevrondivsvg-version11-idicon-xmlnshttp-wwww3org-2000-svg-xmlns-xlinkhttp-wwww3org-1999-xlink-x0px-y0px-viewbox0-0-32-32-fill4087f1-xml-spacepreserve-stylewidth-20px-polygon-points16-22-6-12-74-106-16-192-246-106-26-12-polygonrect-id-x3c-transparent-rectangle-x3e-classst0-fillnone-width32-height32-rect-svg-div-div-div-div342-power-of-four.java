class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1)
            return true;
        
        if (n <= 0)
            return false;

        double sqrtN = Math.sqrt(n);
        double log2SqrtN = Math.log(sqrtN) / Math.log(2);

        return (log2SqrtN == (int) log2SqrtN);
    }
}