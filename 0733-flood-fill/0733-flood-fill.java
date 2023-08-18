class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color )
            return image;
        
        helper(image, sr, sc, color, image[sr][sc]);
        
        return image;
    }
    public void helper(int[][] image, int sr, int sc, int newColor, int prevColor) {
        if(sr == -1 || sr == image.length || sc == -1 || sc == image[0].length)
            return;
        
        if(image[sr][sc] != prevColor)
            return;
        
        image[sr][sc] = newColor;
        
        helper(image, sr-1, sc, newColor, prevColor);
        helper(image, sr, sc+1, newColor, prevColor);
        helper(image, sr+1, sc, newColor, prevColor);
        helper(image, sr, sc-1, newColor, prevColor);
    }
}