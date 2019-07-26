import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class md5hash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        byte[] digest = md.digest(s.getBytes());
        BigInteger num = new BigInteger(1, digest);
        System.out.println(num.toString(16));
    }
}