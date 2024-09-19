import java.util.*;
public class j2011 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++ )
        {
            a[i] = Scanner.nextInt();
        
        }
        for(int i = 0; i < n-1; i++)
        {
            int m = i;
            for(int j = i + 1; j < n; j++ )
            {
                if(a[j] < a[m])
                {
                    m = j;
                }
            }
            if( m != i)
            {
                int cnt = a[m];
                a[m] = a[i];
                a[i] = cnt;
            }
            System.out.print("Buoc "+(i+1)+":");
            for(int x = 0; x < n; x++)
            {
                System.out.print(" " + a[x]);
            }
            System.out.println();
        }
    }
}

// import java.util.Scanner;

// public class j2011{
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         int N = scanner.nextInt(); // Đọc số lượng phần tử trong dãy
//         int[] arr = new int[N];
        
//         for (int i = 0; i < N; i++) {
//             arr[i] = scanner.nextInt(); // Đọc từng phần tử của dãy
//         }
        
//         // Thực hiện sắp xếp chọn
//         for (int i = 0; i < N - 1; i++) {
//             int minIndex = i;
            
//             // Tìm chỉ số của phần tử nhỏ nhất trong đoạn chưa sắp xếp
//             for (int j = i + 1; j < N; j++) {
//                 if (arr[j] < arr[minIndex]) {
//                     minIndex = j;
//                 }
//             }
            
//             // Đổi chỗ phần tử nhỏ nhất với phần tử đầu tiên của đoạn chưa sắp xếp
//             if (minIndex != i) {
//                 int temp = arr[minIndex];
//                 arr[minIndex] = arr[i];
//                 arr[i] = temp;
//             }
            
//             // In ra bước sắp xếp
//             System.out.print("Buoc " + (i + 1) + ": ");
//             for (int k = 0; k < N; k++) {
//                 System.out.print(arr[k] + " ");
//             }
//             System.out.println();
//         }
        
//         scanner.close();
//     }
// }
