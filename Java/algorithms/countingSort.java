import java.util.Scanner;

public class countingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int maximum = 0;
        for (int i = 0; i < n; i++) {
            maximum = Math.max(arr[i], maximum);
        }

        int[] bkeeper = new int[maximum + 1];
        for (int i = 0; i < n; i++) {
            bkeeper[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < bkeeper.length; i++) {
            int count = bkeeper[i];
            while (count-- != 0) {
                arr[j] = i;
                j++;
            }
        }

        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }
}