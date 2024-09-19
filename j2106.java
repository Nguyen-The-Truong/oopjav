import java.util.*;
public class j2106 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int cnt = 0;
        for(int i = 0; i < n; i++)
        {
            int a = Scanner.nextInt();
            int b = Scanner.nextInt();
            int c = Scanner.nextInt();
            int sum = a + b + c;
            if(sum > 1)
            {
                cnt ++;
            }
        }
        System.out.println(cnt);
    }
}
