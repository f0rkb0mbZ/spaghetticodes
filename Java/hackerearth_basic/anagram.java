import java.util.Scanner;

public class anagram {
    static int numdeletions(String s1, String s2) {
        int charset = 26;
        int[] arr = new int[charset];
        for (int i = 0; i < s1.length(); i++) {
            arr[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr[s2.charAt(i) - 'a']--;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += Math.abs(arr[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String s1 = sc.next();
            String s2 = sc.next();
            System.out.println(numdeletions(s1, s2));
        }
    }
}