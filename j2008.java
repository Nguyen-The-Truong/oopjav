import java.util.*;
public class j2008 {
    public static long gcd(long a, long b)
    { 
        if( b == 0) return a;
        return gcd(b, a%b);
    }
    public static long lcm(long a, long b)
    {
        return (a/gcd(a, b)) * b;
    }
    public static long lcm1(int n)
    {
        long cnt = 1;
        for(int i = 2; i <= n; i++)
        {
            cnt = lcm(cnt,i);
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = Scanner.nextInt();
            System.out.println(lcm1(n));
        }
    }
}
