import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class j2005 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int n = Scanner.nextInt();
        int m = Scanner.nextInt();
        Map<Integer, Integer> mpa = new HashMap<>();
        Map<Integer, Integer> mpb = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            int num = Scanner.nextInt();
            mpa.put(num, mpa.getOrDefault(num, 0)+1);
        }
        for(int i = 0; i < m; i++)
        {
            int num = Scanner.nextInt();
            mpb.put(num, mpb.getOrDefault(num, 0)+1);
        }
        Set<Integer> cnt = new TreeSet<>();
        for( int x : mpa.keySet())
        {
            if(mpb.containsKey(x))
            {
                cnt.add(x);
            }
        }
        for(int x : cnt)
        {
            System.out.print(x + " ");
        }
    }
}
