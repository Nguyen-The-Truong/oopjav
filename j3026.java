import java.util.Scanner;

public class j3026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); 
        scanner.nextLine(); 

        for (int i = 0; i < t; i++) {
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            
            if (!a.equals(b)) {
                System.out.println(Math.max(a.length(), b.length()));
            } else {
                System.out.println(-1);
            }
        }

        scanner.close();
    }
}
