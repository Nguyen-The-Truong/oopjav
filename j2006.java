import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class j2006 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int m = Scanner.nextInt();
        Map<Integer, Boolean> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            int num = Scanner.nextInt();
            mp.put(num,true);
        }
        for (int i = 0; i < m; i++)
        {
            int num = Scanner.nextInt();
            mp.put(num, true);
        }
        Set<Integer> cnt = new TreeSet<>(mp.keySet());
        for (int x : cnt)
        {
            System.out.print(x + " ");
        }
    }
}
