import java.util.*;
public class j2037 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        Scanner.nextLine();
        while( t --> 0)
        {
            String[] s = Scanner.nextLine().split(" ");
            int chan = 0;
            
            for(String num : s)
            {
                int so = Integer.parseInt(num);
                if( so % 2 == 0)
                {
                    chan ++;
                }
            }
            if( (s.length % 2 == 0 && 2*chan > s.length) || (s.length % 2 != 0 && 2*chan < s.length))
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            
        }
    }
}
