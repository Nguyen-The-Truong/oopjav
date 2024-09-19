import java.util.Scanner;
public class j1005 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int x = 0; x < t; x++)
        {
           double n = Scanner.nextDouble();
           double H = Scanner.nextDouble();
           for(double i = 1; i < n; i++)
           {
            double yi = H * Math.sqrt(i/n);
            System.out.printf("%.6f ", yi );
           }
        System.out.println();
        }
    }
}
