import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class sha256hash {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        byte[] digest = md.digest(s.getBytes());
        BigInteger num = new BigInteger(1, digest);
        String hash = num.toString(16);
        while(hash.length() < 64){
            hash = "0" + hash;
        }
        System.out.println(hash);
    }
}