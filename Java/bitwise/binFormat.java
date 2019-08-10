import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class binFormat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        for (int tcase = 0; tcase < t; tcase++) {
            int num = Integer.parseInt(br.readLine().trim());
            System.out.println(String.format("%14s", Integer.toBinaryString(num)).replace(" ", "0"));
        }
    }
}