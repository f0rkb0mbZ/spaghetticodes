import java.util.Scanner;

public class maxSubarrSum {

    static int maxSum(int[] arr) {
        int sum = 0;
        int best = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            best = Math.max(best, sum);
        }
        return best;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSum(arr));
    }
}