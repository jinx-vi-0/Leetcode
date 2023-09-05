class Solution {
    public int largestAltitude(int[] gain) {
        int max = gain[0];
        for(int i=1; i<gain.length; i++) {
            gain[i] = gain[i-1]+gain[i];
            max = Math.max(max, gain[i]);
        }
        max = Math.max(0, max);
        return max;
    }
}