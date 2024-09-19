import java.util.Scanner;
public class j1006{
    public static long fibonacci(int n){
        if( n == 1 || n == 2)  return 1;
        long pre1 = 1, pre2 = 1;
        long de = 0 ;
        for( int i = 3; i <= n; i ++){
            de = pre1 + pre2;
            pre1 = pre2;
            pre2 = de;
        }
            return de;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for( int i =0; i< t; i++){
           int a = Scanner.nextInt();
           System.out.println(fibonacci(a));
        }
    }
}
