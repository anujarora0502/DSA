import java.util.*;

public class Recursion{

    public static int factorial(int n){
        
        if(n == 0){
            return 1;
        }


        int ans = n * factorial(n-1);
        return ans;

    }

    public static int fibonacci(int n){
        
        if(n == 0|| n == 1){
            return n;
        }


        int ans = fibonacci(n-1)+fibonacci(n-2);
        return ans;
    }

    //for question on leetcode tower of honoi/help the old man --> https://practice.geeksforgeeks.org/problems/help-the-old-man/0

    public static void TowerOfHanoi(int n, int fromRod, int usingRod, int toRod){
        
       if(n>0){
           
          TowerOfHanoi(n-1, fromRod, toRod, usingRod);
          System.out.println(fromRod+" -> "+toRod);
          TowerOfHanoi(n-1, usingRod, fromRod, toRod);


       }

    }


    public int coinChange(int[] coins, int amount) {
        
        int[] dp = new int[amount+1];
        return coinChange(coins,amount,dp) == (int)1e8? -1:coinChange(coins,amount,dp);
        
    }

    //  Coin Change problem on leetcode
    
    public static int coinChange(int[] coins, int amount, int[] dp){

        if(amount == 0){
            return dp[amount] = 0;
        }

        if(dp[amount]!=0) return dp[amount];

        int minCoins = (int)1e8;

        for(int ele : coins){
            if(amount - ele >=0){
                int Mcoin = coinChange(coins, amount-ele,dp);
                if(Mcoin!= (int)1e8 && Mcoin+1 < minCoins) minCoins = Mcoin+1;
            }
        }

        return dp[amount] = minCoins;
      }
    


    public static void solve(){

      System.out.println(factorial(6));
      System.out.println(fibonacci(7));

      TowerOfHanoi(3, 1, 2, 3);

    }

    // Coin Change 2 problem on leetcode

    

    public static void main(String[] args){
      
        solve();
        
    }
}