class Solution {
    public int countNegatives(int[][] grid) {
        int left = 0, right = 0, mid = 0, count = 0, sum= 0;
        for (int i = 0; i < grid.length; i++) {
            left = 0;
            count = 0;
            right = grid[i].length - 1;
            while (left <= right) {
                mid = left + (right - left) / 2;
                if (grid[i][mid] < 0) {
                    count = grid[i].length - mid;
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            sum += count;
        }
        return sum;
    }
}