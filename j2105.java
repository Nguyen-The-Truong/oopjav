// import java.util.*;
// public class j2105 {
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);
        
//             int n = Scanner.nextInt();
//             int[][] a = new int[n][n];
//             for(int i = 0; i < n; i++)
//             {
//                 for(int j = 0; j < n; j++)
//                 {
//                     a[i][j] = Scanner.nextInt();
//                 }
//             }
//             for(int i = 0; i < n; i++)
//             {
//                 System.out.print("List" + "(" + (i+1) + ") =");
//                 for(int j = 0; j < n; j++)
//                 {
//                     if(a[i][j] == 1) 
//                     {
//                         System.out.print( " "+ j);
//                     }
//                 }
//                 System.out.println();
//             }
        
//     }
// }
import java.util.*;

public class j2105 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số đỉnh của đồ thị
        int n = Integer.parseInt(scanner.nextLine());
        int[][] adjacencyMatrix = new int[n][n];

        // Đọc ma trận kề
        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < n; j++) {
                adjacencyMatrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        // Chuyển đổi ma trận kề sang danh sách kề
        for (int i = 0; i < n; i++) {
            System.out.print("List(" + (i + 1) + ") =");
            for (int j = 0; j < n; j++) {
                if (adjacencyMatrix[i][j] == 1) {
                    System.out.print(" " + (j + 1));
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}

