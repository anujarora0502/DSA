import java.util.*;

public class practice {
    public static class Int {
         
        int a;

        Int(){
            this.a = 0;
        }
        
        Int(int a){
            this.a = a;
        }
        
        public int value(){
            return this.a;
        }
        
    }
    
    
    public static void main(String []args){
       
       Int a = new Int(10);
       Int b = new Int(15);
       
       swap(a,b);
       
       System.out.println(a.value()+" "+b.value());
    }
    
   
    public static void swap(Int a, Int b){
        Int temp = new Int();
        temp= a;
        a = b;
        b = temp;
    }
}