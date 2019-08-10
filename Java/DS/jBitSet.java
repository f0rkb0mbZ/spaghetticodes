import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class jBitSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int first = 0;
        int second = 0;
        int set = 0;
        int index = 0;
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        sc.nextLine();
        for (int i = 0; i < m; i++) {
            String op = sc.next();
            switch (op) {
            case "AND":
                first = sc.nextInt();
                second = sc.nextInt();
                if (first == 1 && second == 2) {
                    b1.and(b2);
                }
                if (first == second && first == 1) {
                    b1.and(b1);
                }
                if (first == second && first == 2) {
                    b2.and(b2);
                }
                if (first == 2 && second == 1) {
                    b2.and(b1);
                }
                System.out.println(b1.cardinality() + " " + b2.cardinality());
                break;
            case "OR":
                first = sc.nextInt();
                second = sc.nextInt();
                if (first == 1 && second == 2) {
                    b1.or(b2);
                }
                if (first == second && first == 1) {
                    b1.or(b1);
                }
                if (first == second && first == 2) {
                    b2.or(b2);
                }
                if (first == 2 && second == 1) {
                    b2.or(b1);
                }
                System.out.println(b1.cardinality() + " " + b2.cardinality());
                break;
            case "XOR":
                first = sc.nextInt();
                second = sc.nextInt();
                if (first == 1 && second == 2) {
                    b1.xor(b2);
                }
                if (first == second && first == 1) {
                    b1.xor(b1);
                }
                if (first == second && first == 2) {
                    b2.xor(b2);
                }
                if (first == 2 && second == 1) {
                    b2.xor(b1);
                }
                System.out.println(b1.cardinality() + " " + b2.cardinality());
                break;
            case "FLIP":
                set = sc.nextInt();
                index = sc.nextInt();
                if (set == 1) {
                    b1.flip(index);
                }
                if (set == 2) {
                    b2.flip(index);
                }
                System.out.println(b1.cardinality() + " " + b2.cardinality());
                break;
            case "SET":
                set = sc.nextInt();
                index = sc.nextInt();
                if (set == 1) {
                    b1.set(index);
                }
                if (set == 2) {
                    b2.set(index);
                }
                System.out.println(b1.cardinality() + " " + b2.cardinality());
                break;
            }
        }
    }
}
