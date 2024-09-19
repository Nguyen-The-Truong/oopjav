import java.util.Scanner;
public class j1013 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        long sum = 0;
        for (int i = 0; i < n; i++)
        {
           int a = Scanner.nextInt();
           int sum2 = 0;
           int cnt = 2;
           while(a != 0)
           {
            if(a % cnt == 0)
            {
                sum2 += cnt;
                a /= cnt;
            }
            else
            {
                cnt ++;
            }
           }
           sum += sum2;
        }
        System.out.println(sum);
            
    }
}

