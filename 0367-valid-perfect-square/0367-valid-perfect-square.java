class Solution {
    public boolean isPerfectSquare(int num) {
        if(binarySearch(num) != -1)
            return true;
        return false;
    }
    public long binarySearch(int n) {
        long low = 1, high = n;
        while(low <= high) {
            long mid = low + (high - low)/2;
            
            if(mid * mid == n) return mid;
            else if(mid * mid < n) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}