import java.util.Scanner;

public class toggleCase {

    static String toggle(String s) {
        char[] chars = new char[s.length()];
        chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char tempchar = chars[i];
            if(tempchar >= 65 && tempchar <= 90){
                chars[i] = (char) ((int) tempchar + 32);
            }
            else if(tempchar >= 97 && tempchar <= 122){
                chars[i] = (char) ((int) tempchar - 32);
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(toggle(s));
    }
}