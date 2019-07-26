import java.math.BigDecimal;
import java.util.*;

class bigDec {

    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();


        Arrays.sort(s, 0, n, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                BigDecimal bg1 = new BigDecimal(s1);
                BigDecimal bg2 = new BigDecimal(s2);
                return bg1.compareTo(bg2);
            }
        });

        // Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}

// 9
// -100
// 50
// 0
// 56.6
// 90
// 0.12
// .12
// 02.34
// 000.000