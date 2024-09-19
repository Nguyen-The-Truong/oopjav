import java.util.Scanner;

public class DivisorsBy2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc số lượng bộ test
        int T = scanner.nextInt();

        // Xử lý từng bộ test
        for (int t = 0; t < T; t++) {
            long N = scanner.nextLong();
            
            // Nếu N lẻ, kết quả là 0
            if (N % 2 != 0) {
                System.out.println(0);
                continue;
            }

            // Loại bỏ tất cả các thừa số 2 từ N
            while (N % 2 == 0) {
                N /= 2;
            }

            // Đếm số ước số của N còn lại (sau khi loại bỏ thừa số 2)
            int count = 0;
            long sqrt = (long) Math.sqrt(N);
            for (long i = 1; i <= sqrt; i++) {
                if (N % i == 0) {
                    count += 2; // Đếm cả i và N/i
                    if (i * i == N) {
                        count--; // Trường hợp i và N/i bằng nhau, chỉ đếm 1 lần
                    }
                }
            }
            System.out.println(count);
        }
        
        scanner.close();
    }
}
