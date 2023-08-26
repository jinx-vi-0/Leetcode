class Solution {
    public int countLatticePoints(int[][] circles) {
        HashSet<String> set = new HashSet<>();
        for(int[] a : circles) {
            int x = a[0], y = a[1], r = a[2];
            for(int i=x-r; i<=x+r; i++) {
                for(int j=y-r; j<=y+r; j++) {
                    if((x-i)*(x-i) + (y-j)*(y-j) <= r*r)
                        set.add(i+","+j);
                }
            }
        }
        return set.size();
    }
}