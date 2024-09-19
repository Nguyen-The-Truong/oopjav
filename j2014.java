import java.util.*;
public class j2014 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int x = 0; x < t; x ++)
        {
            int n = Scanner.nextInt();
            int[] ar = new int[n];
            int sum = 0;
            for(int i = 0; i < n; i++)
            {
                ar[i] = Scanner.nextInt();
                sum += ar[i];

            }
            int left = 0;
            int cnt = -1;
            for(int i = 0; i < n; i++)
            {
                left += ar[i];
                int right = sum - left - ar[i];
                if(left == right)
                {
                    cnt = i+1;
                    break;
                }
                
            }
            System.out.println(cnt);
        }
    }
}
