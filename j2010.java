import java.util.*;
public class j2010 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = Scanner.nextInt();
        }
        for(int i = 0; i < n-1; i++)
        {
            System.out.print("Buoc "+ (i+1) +":");
            for(int j = i + 1; j < n; j++)
            {
                if(a[i] > a[j])
                {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            for(int x = 0; x < n; x++)
            {
                System.out.print(" " + a[x]);
            }
            System.out.println();
        }
    }
}
