class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        
        int total_sum = 0;
        // for(int i : arr)
        //     total_sum += i;
        
        for(int i=0; i<n; i++) {
            int curr_sum = 0;
            for(int j=i; j<n; j++) {
                curr_sum += arr[j];
                
                if((j-i+1) % 2 != 0)
                    total_sum += curr_sum;
            }
        }
        return total_sum;
    }
}