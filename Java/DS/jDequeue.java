import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class jDequeue {
    public static void main(String[] args) {
        Deque deque = new ArrayDeque<>();
        Set unique = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            deque.add(arr[i]);
        }
        for(int i = 1;)
    }
}