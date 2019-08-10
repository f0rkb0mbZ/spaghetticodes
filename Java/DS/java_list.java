import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_list {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(sc.nextInt());
        }
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; i++) {
            String op = sc.next();
            if(op.equals("Insert")){
                l.add(sc.nextInt(), sc.nextInt());
            }
            if(op.equals("Delete")){
                l.remove(sc.nextInt());
            }
        }
        sc.close();
        for(int i: l){
            System.out.print(i+" ");
        }
    }
}
