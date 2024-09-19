import java.util.Scanner;
public class j1007{
    public static boolean ktra(long n){
        long s = (long)Math.sqrt(n);
        return ( s*s == n);
    }
    public static boolean ktra2(long n){
        return(ktra(5*n*n+4)|| ktra(5*n*n - 4));
    }
    public static boolean ktra3(long n){
        if(ktra2(n)) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        for(int i = 0; i< t; i++){
            long n = Scanner.nextLong();
            if(ktra3(n)) {
                System.out.println("YES");
            } 
            else{
                System.out.println("NO");
            }
        }
    }
}