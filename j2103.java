import java.util.*;

public class j2103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for (int test = 1; test <= t; test++) {
   
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            
            int[][] A = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    A[i][j] = scanner.nextInt();
                }
            }
            int[][] AT = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    AT[i][j] = A[j][i];
                }
            }
            int[][] result = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    result[i][j] = 0;
                    for (int k = 0; k < m; k++) {
                        result[i][j] += A[i][k] * AT[k][j];
                    }
                }
            }
            System.out.println("Test " + test + ":");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        
        scanner.close();
    }
}
