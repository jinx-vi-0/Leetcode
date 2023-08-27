class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int cnt=0, cntl=0, cntr=0;
        for(char ch : moves.toCharArray()) {
            if(ch == 'L') cntl++;
            else if(ch == 'R') cntr++;
            else cnt++;
        }
        return Math.abs(cntl-cntr) + cnt;
    }
}