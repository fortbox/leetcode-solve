package No733_图像渲染;

class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        //1, if it is outside the boundary, return directly
        if (image == null || sr >= image.length || sc >= image[0].length) return image;
        //2, if the old value is the same as the new value, it means no need to change, return directly
        if (image[sr][sc] == newColor) return image;
        //3, call the recursive function, change the value.
        this.changeColor(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void changeColor(int[][] image, int sr, int sc, int oldColor, int newColor) {
        //If reach the boundary, return, otherwise recursively
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor) return;
        image[sr][sc] = newColor;
        changeColor(image, sr - 1, sc, oldColor, newColor);
        changeColor(image, sr, sc - 1, oldColor, newColor);
        changeColor(image, sr, sc + 1, oldColor, newColor);
        changeColor(image, sr + 1, sc, oldColor, newColor);
    }
}
