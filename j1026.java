import java.util.Scanner;
public class j1026 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int j = 0; j < t; j ++)
        {
            int n = Scanner.nextInt();
            int s = (int)Math.sqrt(n);
            if( s*s == n)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }


    }
}
