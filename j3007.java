import java.util.Scanner;

public class j3007 {
    public static boolean isPalindrome(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }
    public static int digitSum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }
        return sum;
    }
    public static boolean isBeautiful(String s) {
        
        if (!isPalindrome(s)) {
            return false;
        }
        
        
        if (s.charAt(0) != '8' || s.charAt(s.length() - 1) != '8') {
            return false;
        }
        
        
        if (digitSum(s) % 10 != 0) {
            return false;
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  
        scanner.nextLine();  
        
        for (int i = 0; i < T; i++) {
            String number = scanner.nextLine(); 
            
          
            if (isBeautiful(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
       
    }
}
