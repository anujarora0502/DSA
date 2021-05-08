import java.util.*;

import javax.print.event.PrintEvent;

public class GCD {
   
    public static void main(String[] args) {
          
      System.out.println(GCD(24,36));

    }

    public static int GCD(int a, int b){
        if(b == 0){
            return a;
        }

        int gcd = GCD(b,a%b);

        return gcd;
    }

}