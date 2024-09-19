import java.util.Scanner;
public class j1018 {
    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int x = 0; x < t; x++)
        {
            String n = Scanner.next();
            int sum = 0;
            boolean flag = true;
            boolean flag2 = true;
            for(int i = 0; i < n.length(); i ++)
            {
            
                sum += Math.abs(n.charAt(i) - '0');
            }
            if( sum % 10 != 0)
            {
                flag2 = false;
            }
            
            for(int i = 1; i < n.length(); i++)
                {
                    int di = Math.abs(n.charAt(i) - n.charAt(i-1));
                    if( di != 2)
                    {
                        flag = false;
                        break;
                    }
                
            }
            if(flag && flag2)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

}