import java.util.Scanner;
public class j1002 {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        for(int i = 0; i< n; i++){
            long t = Scanner.nextLong();
            long su = t * (t +1) /2;
            System.out.println(su);
        }
        
    }
}
