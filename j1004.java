import java.util.Scanner;
public class j1004 {
    public static boolean ngto(long n){
         if (n == 0 || n == 1) return false;
         if (n == 2) return true;
         for( int i = 2; i <= Math.sqrt(n); i++){
            if( n % i == 0) return false;
         }
         return true;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int test = Scanner.nextInt();
        for( int i = 0; i < test; i++){
           long n = Scanner.nextLong();
           if( ngto(n)) {
            System.out.println("YES");
           }
           else{
            System.out.println("NO");
           }
        }
    }
}
