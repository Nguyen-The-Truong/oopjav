import java.util.Scanner;

public class j3030 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        int steps = 0;
        boolean isInBSequence = false;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'B') {
                if (!isInBSequence) {
                    steps++;
                    isInBSequence = true;
                }
            } else {
                isInBSequence = false;
            }
        }

        System.out.println(steps);
    }
}
