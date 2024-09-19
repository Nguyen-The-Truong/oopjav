import java.util.*;
public class j2027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 0; x < t; x++)
        {
            int n = sc.nextInt(), K = sc.nextInt();
              int[] A = new int[n];
              for (int i = 0; i < n; i++) {
                  A[i] = sc.nextInt();
              }
              
              Arrays.sort(A);
              
              int count = 0;
              
              for (int i = 0; i < n; i++) {
                  int j = i + 1;
                  while (j < n && A[j] - A[i] < K) {
                      count++;
                      j++;
                  }
              }
              
              System.out.println(count);
            
        
    }
}
}