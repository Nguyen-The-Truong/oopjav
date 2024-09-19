import java.util.*;
public class j3031 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t --> 0)
        {
            String s = sc.next();
            int k = sc.nextInt();
            if(s.length() < 26)
            {
                System.out.println("NO");
                continue;
            }
            boolean[] bo = new boolean[256];
            int cnt = 0;
            for(int i = 0; i < s.length(); i++)
            {
                if(bo[s.charAt(i)] == false)
                {
                    cnt ++;
                    bo[s.charAt(i) ] = true;
                }
            }
            if(26 - cnt > k)
            {
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
