import java.util.*;
public class j2009 {
    public static void j2009(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int lastFinishTime = 0;

        for (int i = 0; i < N; i++) {
            int arrivalTime = sc.nextInt(); 
            int duration = sc.nextInt();    

            lastFinishTime = Math.max(lastFinishTime, arrivalTime) + duration;
        }

        System.out.println(lastFinishTime);
    }

}
