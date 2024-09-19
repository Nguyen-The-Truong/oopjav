import java.util.*;
public class j3029 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean firstWord = true;
        while(sc.hasNextLine()){
            String s = sc.nextLine().toLowerCase();
            StringTokenizer str = new StringTokenizer(s);
            int count = str.countTokens();
            int k = 0;
            StringBuilder res = new StringBuilder();
            while(str.hasMoreTokens()){
                String tmp = str.nextToken();
                char endWord = tmp.charAt(tmp.length() - 1);
                if(k == count - 1){
                    if(tmp.equals(".")||tmp.equals("!")||tmp.equals("?")){
                        res.deleteCharAt(res.length() - 1);
                        res.append(tmp);
                    }
                    else if(endWord == '!'||endWord == '.'||endWord == '?')
                    {
                        res.append(tmp);
                    }
                    else {
                        res.append(tmp + ".");
                    }
                    firstWord = true;
                }
                else {
                    if(firstWord){
                        res.append(Character.toUpperCase(tmp.charAt(0)) + tmp.substring(1) + " ");
                    }
                    else {
                        res.append(tmp + " ");
                    }
                    firstWord = false;
                }
                k += 1;
            }
            System.out.println(res.toString());
        }
    }
    
}
