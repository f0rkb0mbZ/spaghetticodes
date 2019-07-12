// import java.util.Arrays;
// import java.util.Scanner;

// public class primes {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         boolean[] primes = new boolean[n + 1];
//         // Arrays.fill(primes, true);
//         for (int i = 0; i < n+1; i++) {
//             primes[i] = true;
//         }

//         for (int i = 2; i * i <= n; i++) {
//             if (primes[i]) {
//                 for (int p = 2 * i; p <= n; p += i) {
//                     primes[i] = false;
//                 }
//             }
//         }
//         for (boolean b : primes) {
//             System.out.println(b);
//         }
//         for (int i = 2; i <= n; i++) {
//             if (primes[i]) {
//                 System.out.print(i + "\t");
//             }
//         }
//         sc.close();
//     }
// }

import java.util.Scanner;

public class primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = n + 1;
        
        boolean[] primes = new boolean[len];

        for (int i = 0; i < n+1; i++) {
            primes[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (primes[p]) {
                for (int i = 2 * p; i <= n; i += p) {
                    primes[i] = false;
                }
            }
        }

        for(int i = 2;i<=n;i++){
            if(primes[i]){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}