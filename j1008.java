import java.util.Scanner;
public class j1008 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int x = 1; x <= t; x++)
        {
            int n = Scanner.nextInt();
            System.out.print("Test " + x + ": ");
               for(int i = 2; i*i <= n; i++)
               {
                int cnt = 0;
                while( n % i == 0)
                {
                    cnt ++;
                    n /= i;
                }
                if(cnt > 0)
                {
                System.out.print(i+"("+cnt+") ");
                }
            }
                 if(n > 1) System.out.print(n + "(1) ");
                System.out.println();
               }
            
        }
    }

