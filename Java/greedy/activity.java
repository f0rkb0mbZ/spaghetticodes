import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class activity {
    public static void main(String[] args) {
        /* Input Section */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            end[i] = sc.nextInt();
        }
        sc.close();
        /* Creating a HashMap to link the two arrays of start and end times */
        Map<Integer, Integer> stet = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            stet.put(end[i], start[i]);
        }

        Arrays.sort(end);
        System.out.println(stet.get(end[0]) +" : "+ Integer.toString(end[0]));
        int prevend = end[0];
        for (int i = 1; i < n; i++) {
            System.out.println(end[i]);
            if(stet.get(end[i]) >= prevend){
                System.out.println(prevend);
                System.out.println(i);
                System.out.println(stet.get(end[i]) + " : " + Integer.toString(end[i]));
                prevend = end[i];
            }
        }
        // System.out.println(prevend);
    }
}