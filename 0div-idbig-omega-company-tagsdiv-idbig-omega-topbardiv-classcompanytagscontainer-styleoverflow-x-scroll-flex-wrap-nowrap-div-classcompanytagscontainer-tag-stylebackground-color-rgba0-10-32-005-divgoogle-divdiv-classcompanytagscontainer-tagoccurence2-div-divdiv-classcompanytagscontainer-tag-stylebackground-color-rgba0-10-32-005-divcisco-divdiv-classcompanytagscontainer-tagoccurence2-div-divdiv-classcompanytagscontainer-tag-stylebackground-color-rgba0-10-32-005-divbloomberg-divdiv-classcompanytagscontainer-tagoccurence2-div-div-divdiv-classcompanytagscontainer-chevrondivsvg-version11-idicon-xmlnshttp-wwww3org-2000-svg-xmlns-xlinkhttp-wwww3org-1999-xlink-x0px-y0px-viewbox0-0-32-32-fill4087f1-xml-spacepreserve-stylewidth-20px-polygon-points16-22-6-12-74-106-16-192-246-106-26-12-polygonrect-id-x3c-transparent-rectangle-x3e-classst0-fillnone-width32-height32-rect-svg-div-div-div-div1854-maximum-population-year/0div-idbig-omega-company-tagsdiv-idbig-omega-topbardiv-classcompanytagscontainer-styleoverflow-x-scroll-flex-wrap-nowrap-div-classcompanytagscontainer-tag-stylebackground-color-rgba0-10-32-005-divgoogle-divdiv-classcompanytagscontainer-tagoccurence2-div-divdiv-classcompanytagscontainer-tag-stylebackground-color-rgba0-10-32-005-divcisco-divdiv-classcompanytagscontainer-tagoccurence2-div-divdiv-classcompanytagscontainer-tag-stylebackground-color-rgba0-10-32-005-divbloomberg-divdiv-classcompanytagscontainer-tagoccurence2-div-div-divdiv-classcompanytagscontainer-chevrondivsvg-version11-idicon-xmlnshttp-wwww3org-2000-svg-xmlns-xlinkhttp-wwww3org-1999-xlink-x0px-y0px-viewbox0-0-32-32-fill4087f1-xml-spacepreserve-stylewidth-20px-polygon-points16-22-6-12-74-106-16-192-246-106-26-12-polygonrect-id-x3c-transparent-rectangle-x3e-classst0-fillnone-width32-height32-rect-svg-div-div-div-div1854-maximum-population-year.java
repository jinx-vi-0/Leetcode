class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] cnt = new int[101];
        
        for(int[] person : logs) {
            cnt[person[0] - 1950]++;
            cnt[person[1] - 1950]--;
        }
        
        for(int i=1; i<cnt.length; i++)
            cnt[i] += cnt[i-1];
        
        int max = 0, year = 0;
        for(int i=0; i<cnt.length; i++) {
            if(cnt[i] > max) {
                max = cnt[i];
                year = i + 1950;
            }
        }
        return year;
    }
}