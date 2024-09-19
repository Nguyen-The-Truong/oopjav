import java.util.*;
public class j3005 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        Scanner.nextLine();
        for(int x = 0; x < t; x++)
        {
            String in = Scanner.nextLine().trim();
            String[] w = in.split("\\s+");
            String Ho = w[0].toUpperCase();
            StringBuilder ten = new StringBuilder();
            for(int i = 1; i < w.length; i++)
            {
                ten.append(Character.toUpperCase(w[i].charAt(0)))
                    .append(w[i].substring(1).toLowerCase())
                    .append(" ");
            }
        
        System.out.println(ten.toString().trim() + ", " + Ho);
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

//             String lastName = words[0].toUpperCase(); // Họ viết hoa
//             StringBuilder firstNameMiddleName = new StringBuilder();

//             // Ghép phần tên và tên đệm, viết hoa chữ cái đầu tiên
//             for (int j = 1; j < words.length; j++) {
//                 firstNameMiddleName.append(Character.toUpperCase(words[j].charAt(0)))
//                                    .append(words[j].substring(1).toLowerCase())
//                                    .append(" ");
//             }

//             // In kết quả với phần tên, tên đệm trước, họ sau
//             System.out.println(firstNameMiddleName.toString().trim() + ", " + lastName);
//         }

//         scanner.close();
//     }
// }
