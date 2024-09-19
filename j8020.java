import java.util.*;
public class j8020 {
    public static boolean ktra(String s)
    {
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray())
        {
            if( c == '(' || c == '[' || c == '{')
            {
                st.push(c);
            }
            else if(c == ')' || c == ']' || c == '}')
            {
                if(st.isEmpty()) return false;
                char top = st.pop();
                if (c == ')' && top != '(') return false;
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        Scanner.nextLine();
        for(int x = 0; x < t; x ++)
        {
            String s = Scanner.nextLine();
            if(ktra(s)) 
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}


