import java.util.Scanner;

public class gameofStrings {
    static int calculatedays(String s, String t, int n) {
        int days = 0;
        char[] s_chars = s.toCharArray();
        char[] t_chars = t.toCharArray();
        for (int i = 0; i < n; i++) {
            int start = Math.max((int) s_chars[i], (int) t_chars[i]);
            int end = Math.min((int) s_chars[i], (int) t_chars[i]);
            int diff = start - end;

            System.out.println("s: " + start + " e:" + end + " d: " + diff);
            days += (diff / 13) + (diff % 13);
            // while(diff != 0){
            //     if(diff > 0 && diff <= 8){
            //         end++;
            //         days++;
            //         diff = start - end;
            //     }
            //     if(diff >8){
            //         end += 13;
            //         days++;
            //         diff = start - end;
            //     }
            //     if(diff < 0){
            //         end--;
            //         days++;
            //         diff = start - end;
            //     }
            // }
        }

        return days;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String t = sc.next();
        sc.close();
        System.out.println(calculatedays(s, t, n));
    }
}