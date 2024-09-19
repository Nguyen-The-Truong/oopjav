import java.util.*;
public class j3006 {
    public static boolean ktra1(String n)
    {
        for(int i = 0; i < n.length(); i++)
        {
            char c = n.charAt(i);
            if( c != '0' && c != '2' && c != '4' && c != '6' && c != '8')
            {
                return false;
                
            }
        }
        return true;
    }
    public static boolean ktra2(String n)
    {
        for(int i = 0; i < n.length()/2; i++)
        {
            if(n.charAt(i) != n.charAt(n.length()-i-1))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        Scanner.nextLine();
        for(int i = 0; i < t; i++)
        {
            String n = Scanner.next();
            if(ktra1(n) && ktra2(n))
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
