import java.util.*;

public class test{
    public static void main(String[] args){
        Thread t = Thread.currentThread();

        t.setName("Anuj");
        t.setPriority(1);

        System.out.println(t);
    }
}