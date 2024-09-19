import java.util.*;
public class j2007 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t  = Scanner.nextInt();
        for(int x = 1; x <= t; x++)
        {
            int n = Scanner.nextInt();
            int[] ar = new int[n];
            for(int i = 0; i < n; i++)
            {
                ar[i] = Scanner.nextInt();
            }
            LinkedHashMap<Integer, Integer> cmap = new LinkedHashMap<>();
            for(int num : ar)
            {
                cmap.put(num, cmap.getOrDefault(num, 0) + 1);
            }
            System.out.println("Test " +x+ ":");
            for(Map.Entry<Integer, Integer> entry : cmap.entrySet())
            {
                System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
            }
        }
    }
}
// import java.util.*;

// public class j2007 {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Đọc vào số lượng bộ test
//         int testCases = scanner.nextInt();

//         for (int t = 1; t <= testCases; t++) {
//             // Đọc số lượng phần tử của dãy
//             int n = scanner.nextInt();
//             int[] arr = new int[n];

//             // Đọc vào dãy số
//             for (int i = 0; i < n; i++) {
//                 arr[i] = scanner.nextInt();
//             }

//             // Sử dụng LinkedHashMap để lưu trữ và đếm số lần xuất hiện
//             LinkedHashMap<Integer, Integer> countMap = new LinkedHashMap<>();

//             for (int num : arr) {
//                 countMap.put(num, countMap.getOrDefault(num, 0) + 1);
//             }

//             // In kết quả cho bộ test hiện tại
//             System.out.println("Test " + t + ":");
//             for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
//                 System.out.println(entry.getKey() + " xuat hien " + entry.getValue() + " lan");
//             }
//         }

//         scanner.close();
//     }
// }

