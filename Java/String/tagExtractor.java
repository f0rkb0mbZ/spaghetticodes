import java.util.Scanner;

import java.util.regex.*;

public class tagExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        // String[] lines = new String[n];
        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            Pattern tag = Pattern.compile("<(.+)>([^<?]+)</\\1>");
            Matcher m = tag.matcher(line);
            boolean isMatched = false;
            while (m.find()) {
                System.out.println(m.group(2));
                isMatched = true;
            }
            if (!isMatched) {
                System.out.println("None");
            }
        }
    }
}