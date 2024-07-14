import java.util.*;

public class Fibonacci{
    // Recursion
    // Exponential Time Complexity - O(2^n)
    public static int fibRecursion(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibRecursion(n - 1) + fibRecursion(n - 2);
    }


    // Dynamic Programming (Memoization)
    // Linear Time Complexity - O(n)
    public static int fibMemoization(int n, int f[]){
        if(n == 0 || n ==1){
            return n;
        }

        if(f[n] != 0){
            return f[n];
        }

        f[n] = fibMemoization(n - 1, f) + fibMemoization(n - 2, f);
        return f[n];
    }

    // Dynamic Programming (Tabulation)
    // Linear Time Complexity - O(n)
    public static int fibTabulation(int n){
        int dp[] = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String args[]){
        int n = 5;
        int f[] = new int[n + 1];
        System.out.println(fibTabulation(n));
    }
}