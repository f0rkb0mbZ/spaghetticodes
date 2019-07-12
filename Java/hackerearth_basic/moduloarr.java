import java.util.Scanner;

public class moduloarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long answer = 1;
        for (int i = 0; i < n; i++) {
            answer = (answer * arr[i]) % ((long) Math.pow(10, 9) + 7);
        }
        System.out.println(answer);
    }
}