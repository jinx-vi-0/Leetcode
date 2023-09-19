class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<n; i++) {
            int left_subarray = i+1, right_subarray = n-i;
            int total_subarray = left_subarray * right_subarray;
            int contribution = (total_subarray+1)/2;
            
            sum += contribution * arr[i];
        }
        return sum;
    }
}