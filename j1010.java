// import java.util.*;
// public class j1010 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int t = scanner.nextInt();
//         scanner.nextLine(); 
//         for(int x = 0; x < t; x++)
//         {
//             String soNguyen = scanner.nextLine();
//             StringBuilder ketQua = new StringBuilder();
//             boolean hopLe = true;

//             for (char chuSo : soNguyen.toCharArray()) {
//                 switch (chuSo) {
//                     case '0':
//                     case '1':
//                         ketQua.append(chuSo);
//                         break;
//                     case '8':
//                     case '9':
//                         ketQua.append('0');
//                         break;
//                     default:
//                         hopLe = false; 
//                         break;
//                 }
//                 if (!hopLe) break; 
//             }
//             String chuoiKetQua = ketQua.toString().replaceFirst("^0+(?!$)", "");

//             if (hopLe && !chuoiKetQua.isEmpty()) {
//                 System.out.println(chuoiKetQua);
//             } else {
//                 System.out.println("INVALID");
//             }
//         }
//         }
//     }
import java.util.Scanner;

public class j1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soBoTest = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < soBoTest; i++) {
            String soNguyen = scanner.nextLine();
            StringBuilder ketQua = new StringBuilder();
            boolean hopLe = true;
            boolean coSoKhacKhong = false;

            for (char chuSo : soNguyen.toCharArray()) {
                switch (chuSo) {
                    case '0':
                    case '1':
                        ketQua.append(chuSo);
                        if (chuSo != '0') {
                            coSoKhacKhong = true;
                        }
                        break;
                    case '8':
                    case '9':
                        ketQua.append('0');
                        break;
                    default:
                        hopLe = false; 
                        break;
                }
                if (!hopLe) break; 
            }
            String chuoiKetQua = ketQua.toString().replaceFirst("^0+(?!$)", "");
            if (hopLe && coSoKhacKhong && !chuoiKetQua.isEmpty()) {
                System.out.println(chuoiKetQua);
            } else {
                System.out.println("INVALID");
            }
        }

        scanner.close();
    }
}

