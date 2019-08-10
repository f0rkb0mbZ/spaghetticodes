import java.math.BigDecimal;
import java.util.*;

public class bigDecimal {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        BigDecimal[] bd = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            bd[i] = new BigDecimal(s[i]);
        }
        // Write your code here
        Arrays.sort(bd, Collections.reverseOrder());

        for(int i = 0;i<n;i++){
            s[i] = bd[i].toString();
        }
        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}