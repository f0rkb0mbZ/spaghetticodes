import java.util.Scanner;

public class palindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer s = new StringBuffer(sc.next());
        if(s.toString().equals(s.reverse().toString())){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}