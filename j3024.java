import java.util.*;
public class j3024 {

    public static boolean ktra1(String n)
    {
        if(n.isEmpty() || n.charAt(0) == '0') return false;
        for(char c : n.toCharArray())
        {
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }
    public static boolean chan(String n)
    {
        int chan = 0;
        int le = 0;
        for(int i = 0; i < n.length(); i++)
        {
            if((n.charAt(i) - '0') % 2 == 0)
            {
                chan ++;
            }
            else 
            {
                le ++;
            }
        }
        return (n.length()%2 == 0) && chan > le;
    }
    public static boolean le(String n)
    {
        int chan = 0;
        int le = 0;
        for(int i = 0; i < n.length(); i++)
        {
            if((n.charAt(i) - '0') % 2 != 0)
            {
                chan ++;
            }
            else 
            {
                le ++;
            }
        }
        return (n.length()%2 != 0) && chan < le;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        Scanner.nextLine();
        for(int x = 0; x < t; x++)
        {
            String n = Scanner.next();
            if(!ktra1(n))
            {
                System.out.println("INVALID");
            }
            else
            {
                if(chan(n) || le(n))
                {
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
