import java.util.Scanner;

public class liftQueries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a_pos = 0;
        int b_pos = 7;
        for (int i = 0; i < t; i++) {
            int callfloor = sc.nextInt();
            if (Math.abs(callfloor - a_pos) < Math.abs(callfloor - b_pos)) {
                System.out.println('A');
                a_pos = callfloor;
            } else if (Math.abs(callfloor - a_pos) > Math.abs(callfloor - b_pos)) {
                System.out.println('B');
                b_pos = callfloor;
            } else {
                System.out.println('A');
                a_pos = callfloor;
            }
        }
    }
}