import java.util.*;
public class j3025 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        Scanner.nextLine();
        for(int x = 0; x < t; x++)
        {
            String n = Scanner.next();
            int cnt = 0;
            for(int i = 0; i < n.length()/2; i++)
            {
                if(n.charAt(i) != n.charAt(n.length() - 1-  i))
                {
                    cnt ++;
                }
            }
            if(cnt == 1 || cnt == 0 && n.length() %2 !=0)
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
