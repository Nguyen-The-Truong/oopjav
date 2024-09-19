


import java.util.*;

public class j3009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());

        while (testCases-- > 0) {
            String s1 = scanner.nextLine();
            String s2 = scanner.nextLine();

            Set<String> set1 = new HashSet<>(Arrays.asList(s1.split("\\s+")));
            Set<String> set2 = new HashSet<>(Arrays.asList(s2.split("\\s+")));

            set1.removeAll(set2);

            List<String> result = new ArrayList<>(set1);
            Collections.sort(result);

            // In kết quả
            for (String word : result) {
                System.out.print(word + " ");
            }
            System.out.println();
        }

    }
}
