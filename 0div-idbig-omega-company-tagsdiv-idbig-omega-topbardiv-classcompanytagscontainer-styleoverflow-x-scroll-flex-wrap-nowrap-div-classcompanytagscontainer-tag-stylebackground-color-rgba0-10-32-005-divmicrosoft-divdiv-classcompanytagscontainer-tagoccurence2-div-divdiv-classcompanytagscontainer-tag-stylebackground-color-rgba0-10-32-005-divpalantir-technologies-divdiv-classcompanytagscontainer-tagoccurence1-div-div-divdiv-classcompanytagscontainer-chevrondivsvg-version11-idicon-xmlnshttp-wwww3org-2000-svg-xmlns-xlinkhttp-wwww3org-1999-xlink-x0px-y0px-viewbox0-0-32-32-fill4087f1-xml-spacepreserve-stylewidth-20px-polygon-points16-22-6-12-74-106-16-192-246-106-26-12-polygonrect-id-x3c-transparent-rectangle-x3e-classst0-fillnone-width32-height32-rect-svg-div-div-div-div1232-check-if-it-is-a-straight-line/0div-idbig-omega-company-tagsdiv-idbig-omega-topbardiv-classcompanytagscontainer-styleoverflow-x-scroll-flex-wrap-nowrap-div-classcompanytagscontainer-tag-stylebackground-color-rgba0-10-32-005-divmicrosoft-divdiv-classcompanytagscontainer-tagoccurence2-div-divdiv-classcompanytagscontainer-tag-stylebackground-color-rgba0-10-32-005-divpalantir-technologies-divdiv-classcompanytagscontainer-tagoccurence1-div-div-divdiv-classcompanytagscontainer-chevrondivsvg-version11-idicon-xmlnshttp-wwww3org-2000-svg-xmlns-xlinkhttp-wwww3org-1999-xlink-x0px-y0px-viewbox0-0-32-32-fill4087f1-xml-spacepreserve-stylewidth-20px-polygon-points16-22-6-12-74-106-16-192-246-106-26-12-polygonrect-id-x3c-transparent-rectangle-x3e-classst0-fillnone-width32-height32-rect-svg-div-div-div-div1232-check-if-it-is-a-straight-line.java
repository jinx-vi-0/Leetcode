class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if(coordinates.length == 2) return true;
        
        int x1 = coordinates[0][0];
        int x2 = coordinates[1][0];
        
        int y1 = coordinates[0][1];
        int y2 = coordinates[1][1];
        
        int dy = y2 - y1;
        int dx = x2 - x1;
        
        for(int i=0; i<coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            if(dx * (y-y1) != dy * (x-x1))
                return false;
        }
        return true;
    }
}