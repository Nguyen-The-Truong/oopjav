import java.util.Scanner;
public class j1017 {
public static void main(String[] args) {
    Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int i = 0; i < t; i++)
        {
            String n = Scanner.next();
            boolean cnt = true;
            for(int j = 0; j < n.length(); j++)
            {
                
                if(n.charAt(j) != '0' && n.charAt(j) != '1' && n.charAt(j) != '2')
                {
                   cnt = false;
                   break;
                }
            }
            if( cnt)
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
