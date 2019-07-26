import java.io.BufferedReader;
import java.math.BigInteger;

public class stringMultiply {
    public static String multiply(String a, String b) {
        BigInteger bg1 = new BigInteger(a);
        BigInteger bg2 = new BigInteger(b);
        return bg1.multiply(bg2).toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            GfG g = new GfG();
            System.out.println(g.multiply(a, b));
        }
    }
}