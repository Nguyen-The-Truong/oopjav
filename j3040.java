// import java.util.*;
// public class j3040 {
//     public static boolean ktra1(String n)
//     {
//         for(int i = 0; i < n.length(); i++)
//         {
//             if(n.charAt(i) - '0' >= n.charAt(i+1))
//             {
//             return false;
            
//             }
//         }
//         return true;
//     }
//     public static boolean ktra2(String n)
//     {
//         for(int i = 0; i < n.length() - 1; i++)
//         {
//             if(n.charAt(i)!= n.charAt(i+1))
//             {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static boolean ktra3(String n)
//     {
//         return (n.charAt(0) == n.charAt(1) && n.charAt(1) == n.charAt(2) && n.charAt(3) == n.charAt(4));
//     }
//     public static boolean ktra4(String n)
//     {
//         for(int i = 0; i < n.length(); i ++)
//         {
//             if(n.charAt(i) != 6 && n.charAt(i) != 8) return false;
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner Scanner = new Scanner(System.in);
//         int t = Scanner.nextInt();
//         Scanner.nextLine();
//         for(int i = 0; i < t; i++)
//         {
//             String bien = Scanner.nextLine();
//             String so = bien.substring(bien.length() - 5).replace(".", "");
//             if(ktra1(so) || ktra2(so) || ktra3(so) || ktra4(so) )
//             {
//                 System.out.println("YES");
//             }
//             else{
//                 System.out.println("NO");
//             }
//         }
        
//     }
// }


import java.util.Scanner;

public class j3040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String bienSo = scanner.nextLine();
            String daySo = bienSo.substring(bienSo.length() - 5).replace(".", "");

            if (kiemTraTangChat(daySo) || kiemTraBangNhau(daySo) || kiemTraBaBangHai(daySo) || kiemTraLocPhat(daySo)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        scanner.close();
    }

    private static boolean kiemTraTangChat(String daySo) {
        for (int i = 0; i < daySo.length() - 1; i++) {
            if (daySo.charAt(i) >= daySo.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private static boolean kiemTraBangNhau(String daySo) {
        char firstChar = daySo.charAt(0);
        for (int i = 1; i < daySo.length(); i++) {
            if (daySo.charAt(i) != firstChar) {
                return false;
            }
        }
        return true;
    }

    private static boolean kiemTraBaBangHai(String daySo) {
        return (daySo.charAt(0) == daySo.charAt(1) && daySo.charAt(1) == daySo.charAt(2) &&
                daySo.charAt(3) == daySo.charAt(4));
    }

    private static boolean kiemTraLocPhat(String daySo) {
        for (int i = 0; i < daySo.length(); i++) {
            char c = daySo.charAt(i);
            if (c != '6' && c != '8') {
                return false;
            }
        }
        return true;
    }
}
