
import java.util.*;

public class j3010 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        Map<String, Integer> mp = new LinkedHashMap<>();
        Scanner.nextLine();
        while( t --> 0)
        {
            String s = Scanner.nextLine();
            s = s.trim().replaceAll("\\s+", " ");
        
            String[] res = s.split(" ");
            String str = "";
            int n = res.length;
            str += res[n-1].toLowerCase();
            for(int i = 0; i < n-1; i++)
            {
                str += String.valueOf(res[i].charAt(0)).toLowerCase();
            }
            int cnt = 1;
            if(mp.containsKey(str))
            {
                int x = mp.get(str);
                x++;
                
                mp.put(str, x);
                cnt = x;
            }
            else
            {
                int x = 1;
                mp.put(str, x);
            }
            if(cnt != 1) str += String.valueOf(cnt);
            str += "@ptit.edu.vn";
            System.out.println(str);
        }
    }
}