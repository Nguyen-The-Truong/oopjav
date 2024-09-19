import java.util.Scanner;

public class j1014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 
        for (int t = 0; t < T; t++) {
            long N = scanner.nextLong(); 
            long maxPrime = -1;
            while (N % 2 == 0) {
                maxPrime = 2;
                N /= 2;
            }
            for (long i = 3; i * i <= N; i += 2) {
                while (N % i == 0) {
                    maxPrime = i;
                    N /= i;
                }
            }
            if (N > 2) {
                maxPrime = N;
            }
            System.out.println(maxPrime);
        }
        scanner.close();
    }
}
