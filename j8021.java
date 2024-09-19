import java.util.*;
public class j8021 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        int t = Scanner.nextInt();
        Scanner.nextLine();
        for(int x = 0; x < t; x++)
        {
            String s = Scanner.nextLine();
            int res = 0;
            Stack<Integer> stk = new Stack<>();
            stk.add(-1);
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)=='(') stk.add(i);  
                else{
                    stk.pop();
                    if(!stk.isEmpty()){
                        res = Math.max(res,i-stk.peek());
                    }else stk.push(i);
                }
            System.out.println(res);
        }
    }
}
