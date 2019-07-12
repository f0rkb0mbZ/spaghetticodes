import java.util.Scanner;

public class minimumSum {

    static int func_y(int n, int x) {
        float y = (float) n / (float) x;
        if (y >= 0) {
            return (int) (Math.floor(y) * x);
        } else {
            return (int) (Math.ceil(y) * x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = func_y(sc.nextInt(), x);
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}