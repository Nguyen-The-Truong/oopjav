import java.util.*;
public class j3021 {
  public static char doi(char c)
  {
    c = Character.toUpperCase(c);
    if( c == 'A' || c == 'B' || c == 'C') return '2';
    if( c == 'D' || c == 'E' || c == 'F') return '3';
    if( c == 'G' || c == 'H' || c == 'I') return '4';
    if( c == 'J' || c == 'K' || c == 'L') return '5';
    if( c == 'M' || c == 'N' || c == 'O') return '6';
    if( c == 'P' || c == 'Q' || c == 'R' || c == 'S') return '7';
    if( c == 'T' || c == 'U' || c == 'V') return '8';
    if( c == 'W' || c == 'X' || c == 'Y' || c == 'Z') return '9';
    else return '0';
  }
  public static boolean ktra(String n)
  {
    for(int i = 0; i < n.length(); i++)
    {
        if(n.charAt(i) != n.charAt(n.length() - 1 - i)) return false;
    }
    return true;
  }
  public static void main(String[] args) {
      Scanner Scanner = new Scanner(System.in);
      int t = Scanner.nextInt();
      Scanner.nextLine();
      for(int x = 0; x < t; x++)
      {
        String n = Scanner.nextLine();
        StringBuilder num = new StringBuilder();
        for(char c : n.toCharArray())
        {
            num.append(doi(c));
        }
        if(ktra(num.toString()))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
      }
  }
}

// import java.util.*;

// public class Main {
//     // Hàm chuyển ký tự thành số tương ứng
//     public static char getNumber(char c) {
//         c = Character.toUpperCase(c);
//         switch (c) {
//             case 'A': case 'B': case 'C':
//                 return '2';
//             case 'D': case 'E': case 'F':
//                 return '3';
//             case 'G': case 'H': case 'I':
//                 return '4';
//             case 'J': case 'K': case 'L':
//                 return '5';
//             case 'M': case 'N': case 'O':
//                 return '6';
//             case 'P': case 'Q': case 'R': case 'S':
//                 return '7';
//             case 'T': case 'U': case 'V':
//                 return '8';
//             case 'W': case 'X': case 'Y': case 'Z':
//                 return '9';
//             default:
//                 return '0';
//         }
//     }

//     // Hàm kiểm tra dãy số có phải là thuận nghịch hay không
//     public static boolean isPalindrome(String str) {
//         int len = str.length();
//         for (int i = 0; i < len / 2; i++) {
//             if (str.charAt(i) != str.charAt(len - i - 1)) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int testCases = Integer.parseInt(scanner.nextLine());

//         while (testCases-- > 0) {
//             String input = scanner.nextLine();
//             StringBuilder numberSequence = new StringBuilder();

//             // Chuyển chuỗi ký tự thành chuỗi số tương ứng
//             for (char c : input.toCharArray()) {
//                 numberSequence.append(getNumber(c));
//             }

//             // Kiểm tra chuỗi số có phải thuận nghịch hay không
//             if (isPalindrome(numberSequence.toString())) {
//                 System.out.println("YES");
//             } else {
//                 System.out.println("NO");
//             }
//         }

//         scanner.close();
//     }
// }
