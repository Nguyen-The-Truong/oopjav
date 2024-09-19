import java.util.*;
public class j1011 {
    public static long gcd(long a, long b)
    {
        while(b!=0)
        {
            long tmp = b;
            b = a%b;
            a = tmp;
        }
        return a;

    }
    public static long lcm(long a, long b, long gc)
    {
        return (a/gc)*b;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int x = 0; x < t; x ++)
        {
            long a = Scanner.nextInt();
            long b = Scanner.nextInt();
            long uoc = gcd(a, b);
            long boi = lcm(a, b, uoc);
            System.out.println(boi + " " + uoc);
        }
    }
}
