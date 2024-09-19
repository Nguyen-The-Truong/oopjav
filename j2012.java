import java.util.*;
public class j2012 { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] arr = new int[N];
    for (int i = 0; i < N; i++) {
        arr[i] = scanner.nextInt();
    }
    Stack<Integer> st = new Stack<>();
    for(int i = 0; i < N; i++)
    {
        if(!st.isEmpty() && (st.peek()+ arr[i]) % 2 == 0)
        {
            st.pop();
        } 
        else{
            st.push(arr[i]);
        }
    }
    System.out.println(st.size());
    
    }

    
}
