class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] arr = new int[m+n];
        
        int i = 0, j = 0, idx=0;
        while(i < m && j < n) {
            if(nums1[i] <= nums2[j])
                arr[idx] = nums1[i++];
            else
                arr[idx] = nums2[j++];
            idx++;
        }
        while(i < m)
            arr[idx++] = nums1[i++];
        
        while(j < n)
            arr[idx++] = nums2[j++];
        
        double median = 0.0;
        if((m+n)%2==0)
            median = (arr[((m+n)/2)-1] + arr[(m+n)/2])/(double)2;
        else
            median = arr[(m+n)/2];
        
        return median;
    }
}