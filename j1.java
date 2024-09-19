import java.util.Scanner;

public class j1 {
    
    public static int sumOfPrimeFactors(int num) {
        int sum = 0;
        
        while (num % 2 == 0) {
            sum += 2;
            num /= 2;
        }
        
        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                sum += i;
                num /= i;
            }
        }
        
        if (num > 2) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long totalSum = 0;

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            totalSum += sumOfPrimeFactors(num);
        }

        System.out.println(totalSum);
    }
}
