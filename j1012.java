import java.util.Scanner;

public class j1012 {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);
        int t = Scanner.nextInt();
        while(t>0){
            int n = Scanner.nextInt();
            int cnt = 0;
            for(int i = 2; i <= (int)Math.sqrt(n); i ++)
            {
                if(n % i == 0)
                {
                    if(i %2 == 0)
                {
                    cnt ++;
                }
                if((n/i)%2 == 0 && i != n/i)
                {
                    cnt ++;
                }
            }
            }
            if(n%2 == 0)
            {
                cnt ++;
            }
            
            System.out.println(cnt);
            t--;
        }
    }
}
// import java.util.Scanner;

// public class j1012 {
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int t=in.nextInt();
//         while(t>0){
//             long n=in.nextLong();
//             int cnt=0;
//             for(long i=2;i<=(long)Math.sqrt(n);i++){
//                 if(n%i==0){
//                     if(i%2==0) cnt++;
//                     if((n/i)%2==0 && i!=n/i) cnt++;
//                 }
//             }
//             if(n%2==0) cnt++;
//             System.out.println(cnt);
//             t--;
//         }
//     }
// }