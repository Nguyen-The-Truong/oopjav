import java.util.*;
public class j3008 {
    public static boolean ngto(int n)
    {
        if (n == 0 || n == 1) return false;
        if (n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++)
        {
            if( n % i == 0)
            {
                return false;
               
            }
        }
        return true;
    }
    public static boolean ktra1(String n)
    {
        for(int i = 0; i < n.length(); i++)
        {
            int c = n.charAt(i) - '0';
            if(!ngto(c)) return false;
        }
        return true;
    }
    public static boolean ktra2(String n)
    {
        for(int i = 0; i < n.length()/2; i++)
        {
            if( n.charAt(i) != n.charAt(n.length() - 1 - i))
            return false;
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
