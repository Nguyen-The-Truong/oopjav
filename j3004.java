import java.util.*;
public class j3004 {
     public static void main(String[] args) {
         Scanner Scanner = new Scanner(System.in);
         int t = Scanner.nextInt();
         Scanner.nextLine();
         for(int x = 0; x < t; x++)
         {
            String in = Scanner.nextLine().trim();
            String[] words = in.split("\\s+");
            StringBuilder res = new StringBuilder();
            for(String w : words)
            {
                if(!w.isEmpty())
                {
                    res.append(Character.toUpperCase(w.charAt(0)));
                    res.append(w.substring(1).toLowerCase());
                    res.append(" ");
                }
            }
            System.out.println(res.toString().trim());
         }
     }
}


// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int testCases = Integer.parseInt(scanner.nextLine());

//         for (int i = 0; i < testCases; i++) {
//             String input = scanner.nextLine().trim(); // Loại bỏ khoảng trắng thừa ở đầu và cuối
//             String[] words = input.split("\\s+"); // Tách các từ bằng dấu cách
//             StringBuilder result = new StringBuilder();

//             for (String word : words) {
//                 if (!word.isEmpty()) {
//                     // Viết hoa chữ cái đầu tiên và viết thường các chữ cái còn lại
//                     result.append(Character.toUpperCase(word.charAt(0)))
//                           .append(word.substring(1).toLowerCase())
//                           .append(" ");
//                 }
//             }

//             // Loại bỏ dấu cách thừa ở cuối và in kết quả
//             System.out.println(result.toString().trim());
//         }

//         scanner.close();
//     }
// }
