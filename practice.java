import java.util.*;

public class practice {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int N = scn.nextInt();

        int[] jobs = new int[N];

        for (int i = 0; i < N; i++) {
            jobs[i] = scn.nextInt();
        }
        
        int M = scn.nextInt();

        int[] employeesSkill = new int[M];

        for (int i = 0; i < M; i++) {
            employeesSkill[i] = scn.nextInt();
        }

        int[] employeesEndurance = new int[M];

        for (int i = 0; i < M; i++) {
            employeesEndurance[i] = scn.nextInt();
        }

        System.out.println(minimumShifts(N,M,jobs,employeesSkill,employeesEndurance));
    }

    public static int minimumShifts(int N,int M,int[] jobs,int[] X,int[] Y){
        
         
        return 0;


        
    }
}