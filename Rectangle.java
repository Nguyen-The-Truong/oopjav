import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Đọc hai số nguyên từ đầu vào
        int length = scanner.nextInt();
        int width = scanner.nextInt();

        // Kiểm tra tính hợp lệ của dữ liệu đầu vào
        if (length <= 0 || width <= 0) {
            System.out.println(0);
        } else {
            // Tính chu vi và diện tích
            int perimeter = 2 * (length + width);
            int area = length * width;

            // In ra kết quả
            System.out.println(perimeter + " " + area);
        }

        // Đóng scanner
        scanner.close();
    }
}
