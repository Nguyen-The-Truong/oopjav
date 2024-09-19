import java.util.*;
public class j3038 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String n = Scanner.nextLine();
        Set<Character> s = new HashSet<>();
        for(char c : n.toCharArray())
        {
            s.add(c);
        }
        System.out.println(s.size());
    }
}
