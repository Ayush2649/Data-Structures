import java.util.*;

public class Floodfill_Algorithm{
    public static void floodfill(int[][] image, int sr, int sc, int newColor){
        int originalColor = image[sr][sc];
        if(originalColor != newColor){
            dfs(image, sr, sc, originalColor, newColor);
        }
    }

    public static void dfs(int[][] image, int sr, int sc,int originalColor, int newColor){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != originalColor){
            return;
        }

        image[sr][sc] = newColor;

        dfs(image, sr, sc - 1, originalColor, newColor);
        dfs(image, sr, sc + 1, originalColor, newColor);
        dfs(image, sr - 1, sc, originalColor, newColor);
        dfs(image, sr + 1, sc, originalColor, newColor);
    }
    public static void main(String args[]){
        int[][] image = {{1, 1, 1},
                         {1, 1, 0},
                         {1, 0, 1}};

        int sr = 1;
        int sc = 1;
        int newColor = 2;  
        floodfill(image, sr, sc, newColor);

        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}