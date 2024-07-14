import java.util.*;

public class Climbing_Stairs_Memoization{

    public static int countWays(int n, int dp[]){ // O(n)
        if(n == 0){
            return 1;
        }

        if(n < 0){
            return 0;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        return countWays(n - 1, dp) + countWays(n - 2, dp);
    }

    public static void main(String args[]){
        int n = 5;
        int dp[] = new int[n + 1];
        System.out.println(countWays(n, dp));
    }
}