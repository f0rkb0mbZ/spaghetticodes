import java.util.Scanner;

public class costofbaloons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int cg = sc.nextInt();
            int cp = sc.nextInt();
            int n = sc.nextInt();
            int[] pr1 = new int[n];
            int[] pr2 = new int[n];
            for (int j = 0; j < n; j++) {
                pr1[j] = sc.nextInt();
                pr2[j] = sc.nextInt();
            }
            int pr1sum = 0;
            int pr2sum = 0;
            for (int j = 0; j < n; j++) {
                pr1sum += pr1[j];
                pr2sum += pr2[j];
            }
            int cost = (Math.min(cg, cp) * Math.max(pr1sum, pr2sum)) + (Math.max(cg, cp) * Math.min(pr1sum, pr2sum));
            System.out.println(cost);
        }
    }
}