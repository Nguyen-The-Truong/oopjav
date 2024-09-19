import java.util.Scanner;
public class j1025 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int x11 = Scanner.nextInt();
        int y11 = Scanner.nextInt();
        int x21 = Scanner.nextInt();
        int y21 = Scanner.nextInt();
        int x12 = Scanner.nextInt();
        int y12 = Scanner.nextInt();
        int x22 = Scanner.nextInt();
        int y22 = Scanner.nextInt();
        int minX = Math.min(x11,x12);
        int minY = Math.min(y11,y12);
        int maxX = Math.max(x21,x22);
        int maxY = Math.max(y21,y22);
        int w = maxX - minX;
        int d = maxY - minY;
        System.out.println(Math.max(w,d)*Math.max(w,d));
    }
}
