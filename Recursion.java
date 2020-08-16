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
    


    public static void solve(){

      System.out.println(factorial(6));
      System.out.println(fibonacci(7));

      TowerOfHanoi(3, 1, 2, 3);

    }

    public static void main(String[] args){
      
        solve();
        
    }
}