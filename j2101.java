import java.util.*;
public class j2101 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int x = 0; x < t; x ++)
        {
            int n = Scanner.nextInt();
            int[][] arr = new int[n][n];
            for (int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                {
                    arr[i][j] = Scanner.nextInt();
                }
            }
            for(int i = 0; i < n; i++)
            {
                if( i%2 == 0)
                {
                    for(int j = 0; j < n; j++)
                    {
                        System.out.print(arr[i][j] + " ");
                    }
                }
                else{
                    for(int j = n - 1; j >=0; j--)
                    {
                        System.out.print(arr[i][j] + " ");
                    }
                }
            }
            System.out.println();
            
        }
    }
}
