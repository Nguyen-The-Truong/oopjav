import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class j7002 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner Scanner = new Scanner(new File("DATA.in"));
        long res = 0;
        while(Scanner.hasNext())
            {
                String s = Scanner.next();
                for(int i = 0; i < s.length(); i++)
                {
                    if(Character.isDigit(s.charAt(i)))
                    {
                        long tmp = 0;
                        while(i<s.length()&&Character.isDigit(s.charAt(i)))
                        {
                            tmp = tmp*10 + s.charAt(i) - '0';
                            i++;
                        }
                        if(tmp == (int) tmp)
                        {
                            res += tmp;
                        
                        }
                        i--;

                    }
                }

            }
            System.out.println(res);
    }
}