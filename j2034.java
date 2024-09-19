import java.util.*;
public class j2034 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        Set<Integer> se = new TreeSet<>();
        for(int i = 0; i < n; i++)
        {
            se.add(Scanner.nextInt());
        }
        int m = Collections.max(se);
        boolean flg = true;
        for(int i = 1; i <= m; i++)
        {
            if(!se.contains(i))
            {
                System.out.println(i);
                flg = false;
            }
        }
        if(flg)
        {
            System.out.println("Excellent!");
        }
    }
}
