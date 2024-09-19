import java.util.Scanner;
public class j1009 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        long sum = 0;
        for(int i = 1; i <= n; i++)
        {
            long cnt = 1;
            for(int j = 1; j <=i; j++)
            {
                cnt *=j;
            }
            sum += cnt;
        }
        System.out.println(sum);
    }
}
