import java.util.*;

public class Convert_1D_Array_Into_2D_Array {
    
    public static int[][] construct2DArray(int[] original, int m, int n){
        if(m * n != original.length){
            return new int[0][0];
        }

        int[][] result = new int[m][n];
        for(int i = 0; i < m; i++){
            result[i] = Arrays.copyOfRange(original, i * n, i * n + n);
        }
        return result;
    }

    public static void main(String[] args){
        int[] original = {1, 2, 3, 4};
        int m = 2;
        int n = 2;
        int[][] result = construct2DArray(original, m, n);
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[i].length; j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }   
    }
}