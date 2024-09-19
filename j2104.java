import java.util.*;
public class j2104 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                a[i][j] = Scanner.nextInt();
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                if(a[i][j] == 1)
                {
                    System.out.println("(" + (i + 1) + "," + (j + 1) + ")");
                }
            }
        }
    }
}

// import java.util.Scanner;

// public class j2104 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt();  // Đọc số đỉnh của đồ thị
//         int[][] adjacencyMatrix = new int[N][N];
        
//         // Đọc ma trận kề
//         for (int i = 0; i < N; i++) {
//             for (int j = 0; j < N; j++) {
//                 adjacencyMatrix[i][j] = scanner.nextInt();
//             }
//         }
        
//         // Duyệt qua ma trận kề và tạo danh sách cạnh
//         for (int i = 0; i < N; i++) {
//             for (int j = i + 1; j < N; j++) { // Duyệt từ j = i + 1 để tránh lặp cạnh
//                 if (adjacencyMatrix[i][j] == 1) {
//                     System.out.println("(" + (i + 1) + "," + (j + 1) + ")");
//                 }
//             }
//         }
        
//         scanner.close();
//     }
// }
