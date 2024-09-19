import java.util.Scanner;
public class j2004 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int j = 0; j < t; j ++)
        {
            int n = Scanner.nextInt();
            int[] mang = new int[n];
            for( int i = 0; i< n; i++)
            {
               mang[i] = Scanner.nextInt();
            }
            boolean cnt = true;
            for(int i = 0; i < n/2; i++)
            {
                if(mang[i] != mang[n-1-i])
                {
                    cnt = false;
                    break;
                }
            }
            if(cnt)
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
