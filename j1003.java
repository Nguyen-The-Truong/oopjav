import java.util.Scanner;
public class j1003 {
    public static void main(String[] args) {
       Scanner Scanner = new Scanner(System.in);
       double a = Scanner.nextDouble();
       double b = Scanner.nextDouble();
       if( a == 0 && b == 0) {
        System.out.println("VSN");
       }
       else if( a == 0 && b != 0){
            System.out.println("VN");
       }
       else{
        double x = -b / a;
            System.out.printf("%.2f%n", x); 
       }
    }
}
