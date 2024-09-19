import java.util.*;
public class j3027 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String s = Scanner.nextLine();
        Stack<Character> st = new Stack<>();
        for(char c : s.toCharArray())
        {
            if(!st.isEmpty() && st.peek() == c)
            {
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty())
        {
            sb.append(st.pop());
        }
        String kq = sb.reverse().toString();
        if(kq.isEmpty())
        {
            System.out.println("Empty String");
        }
        else
        {
            System.out.println(kq);
        }
    }
}
